FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} Image.jar
ENTRYPOINT ["java","-jar","/Image.jar"]