# Hi Care
Hospital Management System

## Project Description: Hospital Management System
Hi care is a comprehensive Java-based application designed to streamline and automate various administrative and medical processes within a hospital. Built using the Maven build automation tool, this project leverages a modular structure to ensure scalability, maintainability, and ease of integration.

## Prerequisites
- Eclipse IDE for Enterprise Java and Web Developers
- JDK 17 or newer
- Maven
- Apache Tomcat V9.0
- MySQL
- JDBC

## Configuration
https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

https://javatrainingschool.com/first-servlet-example/

Here is a Snapshot of the web libraries 

![image](https://github.com/BilalR4M/HospitalManagementSystem/assets/165455288/32b9d735-4b5c-479b-9d5b-bb57cdbc9765)

## Key Features:
- Patient Management:

## Registration and management of patient information.
- Tracking patient visits and medical history.
- Appointment scheduling and reminders.

## Doctor Management:

Management of doctor profiles and specializations.
Scheduling and managing doctor appointments.
Monitoring doctor availability and shifts.

## Staff Management:

Management of hospital staff information.
Assigning roles and responsibilities to staff members.


## Technology Stack:
  - Programming Language: **Java**
  - Build Tool: **Maven**
  - Web Framework: **Spring MVC**
  - Database: **MySQL/PostgreSQL**
  - Front-End: **JSP, HTML, CSS, JavaScript**
  - Dependency Management: **Maven**
  - Version Control: **Git**
    
## Project Structure:
  - src: Contains the source code of the project, organized into packages such as controller, service, repository, model, and view.
  - WebContent: Contains the web resources including JSP files, HTML, CSS, and JavaScript files.
  - .settings: Configuration files for the development environment.
  - build: Directory for compiled classes and build artifacts.
  - .classpath and .project: Eclipse-specific project files.
  - .metadata: IDE metadata (typically ignored in version control).

## How to Run the Project:

  ## 1. Clone the Repository:


  Copy code
  git clone https://github.com/BilalR4M/HospitalManagementSystem.git
  cd HospitalManagementSystem
  
  
  ## 2. Import the Project into an IDE:
  
  Open Eclipse or IntelliJ IDEA.
  Import the project as a Maven project.
  Configure the Database:
  
  ## 3. Set up a MySQL database.
  
  Update the database configuration in the application.properties file.
  
  ## 4. Build the Project:
  
  Copy code
  mvn clean install


  ## 5. Run the Application:
  
  Copy code
  mvn spring-boot:run
  
  ## Access the Application:
  Open a web browser and go to http://localhost:8080.
  
The Hospital Management System project provides a robust and scalable solution for managing hospital operations efficiently. Its modular design and use of industry-standard technologies make it a suitable choice for deployment in real-world hospital environments. Contributions and suggestions for improvements are welcome to enhance the system further.
