FROM eclipse-temurin:17
WORKDIR /home
COPY ./target/flower-shop-backend-0.0.1-SNAPSHOT.jar flower-shop-backend.jar
COPY ./flowers/images /home/flowers/images
ENTRYPOINT ["java", "-jar", "flower-shop-backend.jar"]