# Student Management System

## Introduction
This project is a simple student management system that includes functionalities for managing student information, enrollment, grades, and course schedules. It uses Java for the backend and MySQL for the database.

## Project Structure
- `setup` branch: Contains project setup files and initial configurations.
- `database` branch: Contains database schema and connection files.
- `crud` branch: Contains CRUD operations for managing student information.

## Setup Instructions

### Prerequisites
- Java Development Kit (JDK) installed
- MySQL installed
- An IDE (IntelliJ IDEA, Eclipse, etc.)

### Database Setup
1. Create a database named `student_management` in MySQL.
2. Run the following SQL script to create the necessary tables:
    ```sql
    CREATE DATABASE student_management;

    USE student_management;

    CREATE TABLE students (
        id INT AUTO_INCREMENT PRIMARY KEY,
        first_name VARCHAR(50),
        last_name VARCHAR(50),
        date_of_birth DATE,
        email VARCHAR(100)
    );

    CREATE TABLE courses (
        id INT AUTO_INCREMENT PRIMARY KEY,
        course_name VARCHAR(100),
        course_code VARCHAR(20)
    );

    CREATE TABLE enrollments (
        student_id INT,
        course_id INT,
        grade VARCHAR(2),
        PRIMARY KEY (student_id, course_id),
        FOREIGN KEY (student_id) REFERENCES students(id),
        FOREIGN KEY (course_id) REFERENCES courses(id)
    );
    ```

### Running the Project
1. Clone the repository:
    ```bash
    git clone Java-SQL-Student-Information-System
    cd student_management
    ```

2. Open the project in your IDE.

3. Update the database connection details in `DatabaseConnection.java` file:
    ```java
    private static final String URL = "jdbc:mysql://localhost:3306/student_management";
    private static final String USER = "root"; // Change to your database user
    private static final String PASSWORD = "your_password"; // Change to your database password
    ```

4. Run the `Main.java` file to test the CRUD operations.

## Contributing
Feel free to fork this repository and make improvements. Pull requests are welcome!

## License
This project is licensed under the MIT License.
