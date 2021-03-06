package com.resilienthome.server.ioT;

import com.resilienthome.enums.IoTType;
import com.resilienthome.model.Address;
import com.resilienthome.model.IoT;
import com.resilienthome.model.config.ServerConfig;
import com.resilienthome.server.ServerImpl;
import com.resilienthome.server.loadbalancer.LoadBalancerServer;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public abstract class IoTServerImpl extends ServerImpl implements IoTServer {

    private final IoT ioT;

    private Address gatewayAddress;

    /**
     * Creates an instance of an IoT using a provided config.
     * <p>
     * Additionally, registers itself remotely to the Gateway, if itself is not a Gateway.
     *
     * @param serverConfig The config used to initialize its IoT server
     * @throws RemoteException Thrown when a Java RMI exception occurs
     */
    protected IoTServerImpl(final ServerConfig serverConfig) throws RemoteException {
        super(serverConfig);
        ioT = createIoT();

        // Register to Load Balancer
        if (getIoT().getIoTType() == IoTType.GATEWAY ||
                getIoT().getIoTType() == IoTType.SENSOR ||
                getIoT().getIoTType() == IoTType.DEVICE) {
            try {
                System.out.println("Registering to Load Balancer...");
                setGatewayAddress(LoadBalancerServer.connect(getServerConfig()
                        .getLoadBalancerAddress())
                        .register(getIoT(), getServerConfig().getAddress()));
                System.out.println("Successfully registered to Load Balancer.");
            } catch (RemoteException | NotBoundException e) {
                e.printStackTrace();
                System.out.println("Failed to register!");
            }
        }
    }

    public abstract IoT createIoT();

    protected IoT getIoT() {
        return ioT;
    }

    protected Address getGatewayAddress() {
        return gatewayAddress;
    }

    @Override
    public void setGatewayAddress(final Address gatewayAddress) throws RemoteException {
        this.gatewayAddress = gatewayAddress;
        if (gatewayAddress != null) {
            System.out.println("Assigned Gateway with address " + gatewayAddress
                    + " by Load Balancer.");
        }
    }
}
