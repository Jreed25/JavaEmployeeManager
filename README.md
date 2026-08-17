# Java Employee Management System

A Java program that uses object-oriented programming to manage different types of employees. The system stores employee information and demonstrates inheritance, encapsulation, and input validation.

## Features

- Create and manage employee information
- Support Production Worker and Shift Supervisor roles
- Store employee name, ID, and hire date
- Manage shift and pay rate for production workers
- Manage salary and bonus information for shift supervisors
- Validate user input

## Concepts Demonstrated

- Object-oriented programming
- Inheritance
- Encapsulation
- Classes and objects
- Constructors
- Input validation
- Multiple related classes

## Project Structure

```text
JavaEmployeeManager/
├── src/
│   ├── Employee.java
│   ├── ProductionWorker.java
│   ├── ShiftSupervisor.java
│   └── ProductionWorkerDemo.java
├── .gitignore
├── LICENSE
└── README.md
```

## How to run

Compile the program with:

```bash
javac -d out src/*.java
```

Run it with:

```bash
java -cp out ProductionWorkerDemo
```
