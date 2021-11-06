FROM openjdk:8-jdk-slim
COPY target/shopperAPI-0.0.1-SNAPSHOT.jar shopper-api.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/shopper-api.jar"]