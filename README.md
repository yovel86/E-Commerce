# E-Commerce

## Overview
This project is a fully functional e-commerce platform designed to showcase the implementation of modern software development principles, including the MVC architecture, robust database schema, modular services, and third-party payment gateway integration. The platform includes essential features such as user authentication, product catalog management, shopping cart functionality, order management, and payment processing using Stripe.

## Features
1. **User Management:**
    - User registration
    - Login & Logout 
    - JWT Tokens
    - Encrypted Passwords

2. **Product Management:**
    - Product catalog with categories and inventory management
    - Add, Edit & Delete Product

3. **Order Management:**
    - Order placement and summary
    - Integration with Razorpay payment gateway

4. **Payment Processing:**
    - Razorpay checkout session integration
    - Handling payment success and failure scenarios

5. **Database Design:**
    - Relational database schema optimized with foreign keys
    - Scalable and normalized schema for efficient data retrieval

6. **Error Handling:**
    - Custom exceptions for meaningful error messages
    - Graceful handling of runtime errors

## Technologies Used
1. **Backend:**
    - Java
    - Spring Boot (Controllers, Services, and Repositories)

2. **Database:**
    - MySQL

3. **Payment Gateway:**
    - Razorpay for secure and seamless payment processing

4. **Tools and Libraries:**
    - Spring Cloud (Eureka Server & API Gateway)
    - Lombok for reducing boilerplate code
    - Hibernate for ORM

## Key Highlights
1. **Razorpay Integration:** Implemented for secure and seamless payment processing.
2. **Scalability:** Database schema is normalized, ensuring efficient data handling as the application grows.
3. **Error Management:** Custom exceptions like `CategoryNotFoundException` and `ProductNotFoundException` improve user experience.

## Areas of Improvement
1. **Multi-Gateway Payments:** Add support for multiple payment gateways for user flexibility.
2. **Frontend Integration:** Build a responsive frontend using React or Angular to complete the platform.
3. **Advanced Monitoring:** Integrate tools like Prometheus & Grafana to have Observability for our application.

## Conclusion
This project provided hands-on experience with building an e-commerce platform using modern software development principles. By focusing on scalability, modularity, and real-world integrations like Razorpay, the project offers practical insights into developing robust and maintainable applications. While there are some limitations, the system is well-positioned for enhancements and scaling in future iterations.

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven
- Docker
- Razorpay account and API keys

### Installation
1. Clone the repository:
    ```sh
   git clone https://github.com/yovel86/E-Commerce.git
    ```
2. Navigate to the project directory:
    ```sh
    cd E-Commerce
    ```
3. Compile & Package into JAR:
    ```sh
    mvn clean package -DskipTests
    ```

### Configuration
1. Update the `application.properties` file with your Razorpay API configurations

### Running the Application
1. Start the application:
    ```sh
    docker compose up --build
    ```
2. Access the application at `http://localhost:8080`.

## API Endpoints

### User Management
- `POST /users/signup` - Create a new user
- `POST /users/login` - Login user 
- `POST /users/logout` - Logout user
- `GET /users/profile/{userId}` - Get user details

### Product Management
- `POST /products` - Create a new product
- `GET /products` - Get all products
- `GET /products/{productId}` - Get Product by ID
- `PATCH /products/{productId}/price` - Update product price
- `PATCH /products/{productId}/image` - Update product image
- `PATCH /products/{productId}/available_quantity` - Update product quantity
- `DELETE /products/{productId}` - Delete a product
- `GET /products/details` - Get details of a list of products

### Order Management
- `POST /orders` - Create a new order
- `DELETE /orders/{orderId}` - Delete a order
- `GET /orders/{orderId}/amount` - Get order amount
- `GET /orders/trending` - Get trending products
- `GET /orders` - Get details of all orders
- `GET /orders/{orderId}` - Get details of an order by ID

### Category Management
- `GET /products/categories` - Get all categories
- `GET /products/categories/{categoryId}` - Get category by ID
- `POST /products/categories` - Create a new category
- `PATCH /products/categories/{id}/name` - Update name of the category 
- `DELETE /products/categories/{id}` - Delete a category

### Payment Management
- `POST /payments` - Create a new payment


