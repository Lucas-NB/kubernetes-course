FROM maven:3.8.3-openjdk-17 AS builder

WORKDIR /usr/app/src

COPY . .

RUN mvn clean package

FROM openjdk:17.0.2-jdk

WORKDIR /usr/app/src

COPY --from=builder /usr/app/src/target/pingpong-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "pingpong-0.0.1-SNAPSHOT.jar"]