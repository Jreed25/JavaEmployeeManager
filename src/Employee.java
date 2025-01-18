import java.util.Scanner;

/**
 * Represents a general employee with basic details like name, ID, and hire date.
 * Provides methods to validate and set employee attributes.
 */

public class Employee {
    // Data fields
    private String employeeName;
    private String employeeNumber;
    private String hireDate;

    // Parameterized constructor for Employee
    public Employee(String empName, String empNumber, String date)
    {
        setName(empName);
        setNumber(empNumber);
        setDate(date);
    }


// Accessor methods of the Employees details

    public String getName()
    {
        return employeeName;
    }

    public String getNumber()
    {
        return employeeNumber;
    }

    public String getDate()
    {
        return hireDate;
    }

    // Validates and returns the Employees name
    public static String getValidatedName(Scanner input)
    {
        String name;
        while (true)
        {
            System.out.print("Enter the employee name: ");
            name = input.nextLine();

            // Checking if the name is valid
            if (name.matches("[a-zA-Z ]+")) {
                return name;
            } else {
                System.out.println("Invalid name. Please enter the letters and spaces only.");
            }
        }

    }

    // Validates and returns the Employees number
    public static String getValidatedNumber(Scanner input)
    {
        String number;
        while(true)
        {
            System.out.print("Enter the employee number in the format XXX-L (X: digits, L: A-M): ");
            number = input.nextLine();

            // Checks for valid format and input for the employee number
            if(number.length() == 5
                    && Character.isDigit(number.charAt(0))
                    && Character.isDigit(number.charAt(1))
                    && Character.isDigit(number.charAt(2))
                    && number.charAt(3) == '-'
                    && (number.charAt(4) >= 'A' && number.charAt(4) <= 'M'))
            {
                return number;
            }
            else
            {
                System.out.println("Invalid employee number. Ensure it follows the format XXX-L");
            }
        }
    }

    // Validates and returns the Employees hire date
    public static String getValidatedDate(Scanner input)
    {
        String date;
        while (true) {

            System.out.print("Enter the employee hire date (MM-DD-YYYY): ");
            date = input.nextLine();

            // Checks that the date is in the correct format
            if (date.matches("\\d{2}-\\d{2}-\\d{4}")) {
                String[] parts = date.split("-");

                int month = Integer.parseInt(parts[0]);
                int day = Integer.parseInt(parts[1]);
                int year = Integer.parseInt(parts[2]);
                if(isValidDate(month, day, year)) {
                    return date;
                } else
                {
                    System.out.println("Invalid date values. Please ensure the date is valid.");
                }
            } else {
                System.out.println("Invalid date format. Please use MM-DD-YYYY. ");
            }
        }
    }

    // Function for valid date
    public static boolean isValidDate(int month, int day, int year)
    {
        // Checks if the day is in a valid range for the month
        if (month < 1 || month > 12) {
            return false;
        }
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Adjust for leap year
        if (month == 2 && isLeapYear(year))
        {
            daysInMonth[1] = 29;
        }

        return day > 0 && day <= daysInMonth[month - 1];
    }

    // Check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


    // Mutator methods for the Employees details
    public void setName(String empName)
    {
        employeeName = empName;
    }

    public void setNumber(String empNumber)
    {
        employeeNumber = empNumber;
    }

    public void setDate(String date)
    {
        hireDate = date;
    }

    // Returns a string representation of Employee
    public String toString()
    {
        String result;

        result = "Employee name: " + employeeName + "\n"
                + "Employee number: " + employeeNumber + "\n"
                + "Employee hire date: " + hireDate;

        return result;
    }
}
