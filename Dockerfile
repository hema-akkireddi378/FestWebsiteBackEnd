# Use Java 21
FROM openjdk:21-jdk-slim

# Working directory inside container
WORKDIR /app

# Copy the JAR file
COPY target/festwebsite-0.0.1-SNAPSHOT.jar app.jar

# Expose backend port
EXPOSE 8081

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
