Overview  
This is a Java-based Employee Management System that models different employee roles, including Production Workers and Shift Supervisors. 
The program allows users to enter and validate employee details such as name, ID, hire date, shift, and pay rate.


Features

- Employee Data Management: Store and manage employee details.
- Role-Specific Classes: Separate classes for different roles (Production Worker, Shift Supervisor, etc.).
- Input Validation: Ensures valid input for employee name, number, date, shift, and pay rate.
- Automatic Error Handling: Prevents incorrect data entry through validation checks.
- Object-Oriented Structure: Uses inheritance and encapsulation for maintainability.


Files Included

- Employee.java - Base class for all employees.
- ProductionWorker.java - Inherits from Employee, includes shift and pay rate.
- ShiftSupervisor.java - Inherits from Employee, includes salary and bonus.
- ProductionWorkerDemo.java - Demonstration program that interacts with the user.


Future Improvements

- Add a graphical user interface (GUI).
- Implement a database for persistent storage.
- Extend functionality with more employee roles.
- Optimize constructors and remove unused methods.


License
This project is licensed under the MIT License.

