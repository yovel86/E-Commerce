# Use a base image with JDK
FROM amazoncorretto:17.0.12-al2023-headful

# Set the working directory
WORKDIR /app

# Copy the JAR file to the container
COPY target/ProductMS-0.0.1-SNAPSHOT.jar /app/ProductMS-0.0.1-SNAPSHOT.jar

# Expose the port on which the application will run
EXPOSE 8081

# Define the command to run the JAR file
CMD ["java", "-jar", "/app/ProductMS-0.0.1-SNAPSHOT.jar"]
