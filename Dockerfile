FROM eclipse-temurin:17
WORKDIR /home
COPY ./flowers ./flowers
COPY ./target/finalbackend-0.0.1-SNAPSHOT.jar finalbackend.jar
ENTRYPOINT ["java", "-jar", "finalbackend.jar"]