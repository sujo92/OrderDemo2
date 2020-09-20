FROM openjdk:11-jdk-alpine
VOLUME /tmp
COPY ./target/HelloWorld-0.0.1-SNAPSHOT.jar api.jar
ENTRYPOINT ["java","-jar","/api.jar"]