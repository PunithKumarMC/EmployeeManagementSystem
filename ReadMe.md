# Employee Management System
The Employee Management System is a Java console application that allows users to manage employee data. The system provides the following functionalities:

**Add employee:** The user can add employee data such as name, date of birth, email, and address. The system automatically generates a unique employee ID for each employee, and stores the employee data in a MySQL database using JDBC.

**Search employee:** The user can search for an employee using their name, email, or employee ID. The system retrieves the employee details from the MySQL database using JDBC, and displays the results if found, otherwise it shows a message indicating that the employee is not found.

**Display all employees:** The user can display all the employees in the system in sorted order of employee ID. The system retrieves the employee data from the MySQL database using JDBC, and sorts the results by employee ID before displaying them.

### Implementation Details
Employee Class: The Employee class represents an employee in the system. It has the following attributes:

Employee ID (auto-generated)

Name

Date of Birth

Email

Address

EmployeeDAO Class: The EmployeeDAO (Data Access Object) class is responsible for managing employee data in the MySQL database using JDBC. It provides the following methods:

addEmployee(Employee employee): Adds a new employee to the database.

getEmployeeByName(String name): Returns the employee object with the given name from the database.

getEmployeeByEmail(String email): Returns the employee object with the given email from the database.

getEmployeeById(int id): Returns the employee object with the given ID from the database.

getAllEmployees(): Returns a sorted list of all employees by ID from the database.

Main Class: The Main class is the entry point of the application. It provides a command-line interface for the user to interact with the system. The user can choose to add an employee, search for an employee, or display all employees. The Main class interacts with the EmployeeDAO class to perform CRUD (Create, Read, Update, Delete) operations on the employee data in the database.

MySQL Database: The employee data is stored in a MySQL database. The database has a table named "employees" with the following columns:

id (auto-increment)

name

date_of_birth

email

address

Additional Considerations

Input Validation: The system should validate user input to ensure that the data entered is in the correct format.

Persistence: The employee data should be persisted in the MySQL database to ensure that the data is not lost when the application is restarted.

Note:
1. Write test cases for all the methods.
2. Fork the project and then clone it on your machine. Complete the code and commit on each step. Once done push the code to your GitHub repository
