FROM openjdk:11-jdk-slim
WORKDIR /home/product
COPY target/matches-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]