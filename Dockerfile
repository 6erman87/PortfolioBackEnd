FROM amazoncorretto:17-alpine-jdk
MAINTAINER GNB // quien es el dueño
COPY target/BackEnd-0.0.1-SNAPSHOT.jar gnb-app.jar
ENTRYPOINT ["java","-jar","/gnb-app.jar" ]