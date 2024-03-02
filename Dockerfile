#Start with a base image containing Java runtime
FROM openjdk:17-slim as build
#ADD the application's jar to the container
COPY target/ipandhost-0.0.1-SNAPSHOT.jar ipandhost-0.0.1-SNAPSHOT.jar
#execute the application
ENTRYPOINT ["java","-jar","/ipandhost-0.0.1-SNAPSHOT.jar"]