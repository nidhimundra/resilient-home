# Resilient Home

Collaborators: [Daksh Jotwani](https://github.com/dakshj), [Nidhi Mundra](https://github.com/nidhimundra)

## Building the Project
**Windows**

`gradlew clean`

`gradlew build`

**Unix**

`./gradlew clean`

`./gradlew build`

## Generating a JAR
**Windows**

`gradlew clean`

`gradlew fatJar`

**Unix**

`./gradlew clean`

`./gradlew fatJar`

## Starting a Load Balancer Server
`java -jar {jar-file-path} 0 {config-json-file-path}`
[[Sample Config JSON](https://github.com/umass-cs677/resilient-home/blob/master/app/txt/config/LoadBalancerConfig.json)]

## Starting a Gateway Server
`java -jar {jar-file-path} 1 {config-json-file-path}`
[[Sample Config JSON](https://github.com/umass-cs677/resilient-home/blob/master/app/txt/config/Gateway1Config.json)]

## Starting a DB Server
`java -jar {jar-file-path} 2 {config-json-file-path}`
[[Sample Config JSON](https://github.com/umass-cs677/resilient-home/blob/master/app/txt/config/Db1Config.json)]

## Starting a Temperature Sensor Server
`java -jar {jar-file-path} 3 {config-json-file-path}`
[[Sample Config JSON](https://github.com/umass-cs677/resilient-home/blob/master/app/txt/config/TemperatureSensorConfig.json)]

## Starting a Motion Sensor Server
`java -jar {jar-file-path} 3 {config-json-file-path}`
[[Sample Config JSON](https://github.com/umass-cs677/resilient-home/blob/master/app/txt/config/MotionSensorConfig.json)]

## Starting a Door Sensor Server
`java -jar {jar-file-path} 3 {config-json-file-path}`
[[Sample Config JSON](https://github.com/umass-cs677/resilient-home/blob/master/app/txt/config/DoorSensorConfig.json)]

## Starting a Presence Sensor Server
`java -jar {jar-file-path} 3 {config-json-file-path}`
[[Sample Config JSON](https://github.com/umass-cs677/resilient-home/blob/master/app/txt/config/PresenceSensorConfig.json)]

## Starting a Bulb Server
`java -jar {jar-file-path} 4 {config-json-file-path}`
[[Sample Config JSON](https://github.com/umass-cs677/resilient-home/blob/master/app/txt/config/BulbConfig.json)]

## Starting an Outlet Server
`java -jar {jar-file-path} 4 {config-json-file-path}`
[[Sample Config JSON](https://github.com/umass-cs677/resilient-home/blob/master/app/txt/config/OutletConfig.json)]

## Executing a User
`java -jar {jar-file-path} 5 {config-json-file-path}`
[[Sample Config JSON](https://github.com/umass-cs677/resilient-home/blob/master/app/txt/config/UserConfig.json)]

## Executing an Intruder
`java -jar {jar-file-path} 5 {config-json-file-path}`
[[Sample Config JSON](https://github.com/umass-cs677/resilient-home/blob/master/app/txt/config/IntruderConfig.json)]

## Project Execution Steps
1. Run Load Balancer
1. Run Gateways
1. Run DBs
1. Run all IoTs (Bulb, Outlet, Door Sensor, Motion Sensor, Presence Sensor and Temperature Sensor)
1. Run User / Intruder

## License

    Copyright 2017 Daksh Jotwani, Nidhi Mundra

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
