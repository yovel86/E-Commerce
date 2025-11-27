# Use the OpenJDK image
FROM amazoncorretto:17.0.12-al2023-headful

# Set the working directory
WORKDIR /app

# Copy the JAR file from the target directory to /app
COPY target/*.jar user-service.jar

# Expose the port that the application will run on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "user-service.jar"]
