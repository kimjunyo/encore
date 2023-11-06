#! /bin/bash
mvn clean package
docker build -t ostock/configserver:0.1-SNAPSHOT --build-arg JAR_FILE=target/configserver-0.1-SNAPSHOT.jar ./configserver
docker build -t ostock/eurekaserver:0.1-SNAPSHOT --build-arg JAR_FILE=target/eurekaserver-0.1-SNAPSHOT.jar ./eurekaserver
docker build -t ostock/gatewayserver:0.1-SNAPSHOT --build-arg JAR_FILE=target/gatewayserver-0.1-SNAPSHOT.jar ./gatewayserver
docker build -t ostock/kbo-service:0.1-SNAPSHOT --build-arg JAR_FILE=target/gatewayserver-0.1-SNAPSHOT.jar ./gatewayserver
docker build -t ostock/coffee-service:0.1-SNAPSHOT --build-arg JAR_FILE=target/gatewayserver-0.1-SNAPSHOT.jar ./gatewayserver