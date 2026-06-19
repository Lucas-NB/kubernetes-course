FROM eclipse-temurin:17.0.19_10-jdk-resolute

WORKDIR /usr/app

COPY . .

RUN ./mvnw clean package -DskipTests

ENTRYPOINT ["java", "-jar", "target/todo-app-0.0.1-SNAPSHOT.jar"]