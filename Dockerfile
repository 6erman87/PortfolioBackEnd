FROM openjdk:17-alpine
MAINTAINER GNB
COPY target/BackEnd-0.0.1-SNAPSHOT.jar gnb-app.jar
ENTRYPOINT ["java","-jar","/gnb-app.jar" ]