# Use a base image with JDK
FROM amazoncorretto:17.0.12-al2023-headful

# Set the working directory
WORKDIR /app

# Copy the JAR file to the container
COPY target/*.jar order-service.jar

# Expose the port on which the application will run
EXPOSE 8083

# Define the command to run the JAR file
CMD ["java", "-jar", "order-service.jar"]
