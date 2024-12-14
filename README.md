# E-Commerce Application

## Project Overview
This e-commerce application is a domain-driven, scalable, and microservices-based system designed to streamline operations for an online business. It enables customers to browse products, place orders, and process payments, all while ensuring reliability and fault tolerance.

---

## Key Features
- **Domain Separation**: Divided into Customer, Order, Product, Payment, and Notification domains for modularity.
- **Microservices Architecture**: Independent services for scalability and maintainability.
- **Centralized Configuration**: Managed through a Config Server.
- **Service Discovery**: Facilitated by a Discovery Server.
- **Reliability**: Handles component failures gracefully.
- **Notification System**: Sends email alerts for transaction confirmations or failures.

---

## Business Context
### Problem
The business lacked digital solutions, making processes inefficient and limiting growth opportunities.

### Goals
1. Simplify processes like order placement and payment.
2. Promote scalability and operational efficiency.
3. Ensure system reliability and fault tolerance.

---

## Architecture
### Core Domains
1. **Customer Domain**: Manages customer data and operations.
2. **Order Domain**: Handles order management and processing.
3. **Product Domain**: Maintains product details.
4. **Payment Domain**: Processes payments securely.
5. **Notification Domain**: Sends email notifications.

### Infrastructure Components
- **Config Server**: Centralized configuration management.
- **Discovery Server**: Dynamic service registration for communication between microservices.
- **API Gateway**: Routes external requests to the appropriate microservice.

### Characteristics
- **Scalable**: Handles increasing user loads.
- **Fault Tolerant**: Ensures operational continuity despite service failures.
- **Efficient Development**: Modularized for easier updates and debugging.

---

## Building the Application
To build the application, follow these steps:
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd e-commerce-app
2. Build the project using Maven:
   ```bash
   mvn clean install

---

## Starting the Services
After building the application, start each service using the following commands.

- **Config Server**:
   ```bash
   cd services/config-server
   mvn spring-boot:run

- **Discovery Server**:
   ```bash
   cd services/discovery-server
   mvn spring-boot:run

- **API Gateway**:
   ```bash
   cd services/api-gateway
   mvn spring-boot:run

- **Customer Service**:
   ```bash
   cd services/customer-service
   mvn spring-boot:run

- **Order Service**:
   ```bash
   cd services/order-service
   mvn spring-boot:run

- **Payment Service**:
   ```bash
   cd services/payment-service
   mvn spring-boot:run

- **Notification Service**:
   ```bash
   cd services/notification-service
   mvn spring-boot:run

---

## Microservices Details
After building the application, start each service using the following commands.

### Config Server
- Handles increasing user loads.
- Supports dynamic updates.

### Discovery Server
- Facilitates service registration and discovery for seamless communication.

### API Gateway
- Entry point for all client requests.
- Handles routing and security.

### Customer Service
- Manages customer profiles, including addresses and contact details.

### Order Service
- Processes and tracks orders.
- Integrates with payment and product services.

### Payment Service
- Manages payment methods and transactions.
- Ensures secure payment processing.

### Notification Service
- Sends email notifications for successful or failed transactions.