FROM eclipse-temurin:17
WORKDIR /home
COPY ./flowers ./flowers
COPY ./target/c322-finalbackend-0.0.1-SNAPSHOT.jar finalbackend.jar
ENTRYPOINT ["java", "-jar", "finalbackend.jar"]