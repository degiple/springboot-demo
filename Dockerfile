# Use an official OpenJDK runtime as the base image
FROM openjdk:11-jre-slim

# Set the working directory to /app
WORKDIR /app

# Copy the target/[アプリケーション名].jar file into the container at /app
COPY build/libs/demo-0.0.1-SNAPSHOT.jar app.jar

# Specify the command to run the app
CMD ["java", "-jar", "app.jar"]