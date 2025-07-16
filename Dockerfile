# Use Java 21 base image
FROM openjdk:21-jdk-slim

# Set working directory inside container
WORKDIR /app

# Copy the JAR file into container
COPY target/festwebsite-0.0.1-SNAPSHOT.jar app.jar

# Expose port used by Spring Boot
EXPOSE 8081

# Command to run your Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]
