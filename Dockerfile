FROM eclipse-temurin:17-jdk-alpine
MAINTAINER GNB
COPY target/BackEnd-0.0.1-SNAPSHOT.jar gnb-app.jar
ENTRYPOINT ["java","-jar","/gnb-app.jar"]