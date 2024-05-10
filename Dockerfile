FROM openjdk:17-alpine

ARG JAR_FILE=/build/libs/TestDocker-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} /TestDocker.jar

ENTRYPOINT ["java","-jar","-Dspring.profiles.active=prod", "/TestDocker.jar"]