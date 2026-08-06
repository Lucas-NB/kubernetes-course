FROM maven:3.8.3-openjdk-17 AS builder

WORKDIR /usr/app/src

COPY . .

RUN mvn clean package

FROM openjdk:17.0.2-jdk

WORKDIR /usr/app/src

COPY --from=builder /usr/app/src/target/log-output-1.0-SNAPSHOT-jar-with-dependencies.jar log-output-1.0-SNAPSHOT-jar-with-dependencies.jar

ENTRYPOINT ["java", "-jar", "/usr/app/src/log-output-1.0-SNAPSHOT-jar-with-dependencies.jar"]
