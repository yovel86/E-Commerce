# Use the OpenJDK image
FROM amazoncorretto:17.0.12-al2023-headful

# Set the working directory
WORKDIR /app

# Copy the entire content of the current directory to /app
COPY . .

# Copy the JAR file from the target directory to /app
COPY target/UserService-0.0.1-SNAPSHOT.jar /app/

# Expose the port that the application will run on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "/app/UserService-0.0.1-SNAPSHOT.jar"]
