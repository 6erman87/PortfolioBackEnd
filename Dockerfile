FROM amazoncorretto:17-alpine-jdk
MAINTAINER GNB
COPY target/BackEnd-0.0.1-SNAPSHOT.jar gnbapp.jar
ENTRYPOINT ["java","-jar","/gnbapp.jar"]
EXPOSE 8080