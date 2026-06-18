FROM openjdk:17.0.2-jdk

WORKDIR /usr/app/src

ADD src/main/java/* .

RUN javac *

ENTRYPOINT ["java", "Main"]