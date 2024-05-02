FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/flower-service-0.0.1-SNAPSHOT.jar flower-service.jar
COPY ./flowers/ ./flowers/
ENTRYPOINT ["java", "-jar", "flower-service.jar"]
