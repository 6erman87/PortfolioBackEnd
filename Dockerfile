FROM openjdk:21-ea-21-jdk-windowsservercore-ltsc2022
MAINTAINER GNB
COPY target/BackEnd-0.0.1-SNAPSHOT.jar gnb-app.jar
ENTRYPOINT ["java","-jar","/gnb-app.jar"]