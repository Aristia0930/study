
FROM openjdk:17-jdk
LABEL authors="kjk98"
ARG JAR_FILE=build/libs/dockerTest-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} docker-springboot.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker-springboot.jar"]