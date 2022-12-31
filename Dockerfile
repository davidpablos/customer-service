FROM maven:3.8.3-jdk-11-slim AS build

WORKDIR /home/customer-service

COPY ./ /home/customer-service

RUN mvn clean package

FROM openjdk:11-jre-slim

COPY --from=build /home/customer-service/target/customer-service.jar /home

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/home/customer-service.jar"]
