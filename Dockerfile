FROM amazoncorretto:11-alpine-jdk
MAINTAINER GNB
COPY target/BackEnd-0.0.1-SNAPSHOT.jar gnb-app.jar
ENTRYPOINT ["java","-jar","/gnb-app.jar" ]
EXPOSE 8080