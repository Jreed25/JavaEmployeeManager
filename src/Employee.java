import java.util.Scanner;

/**
 * Represents a general employee with basic details such as name,
 * employee number, and hire date.
 */

public class Employee {
    private String employeeName;
    private String employeeNumber;
    private String hireDate;

    public Employee(String empName, String empNumber, String date)
    {
        setName(empName);
        setNumber(empNumber);
        setDate(date);
    }


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


    public static String getValidatedName(Scanner input)
    {
        String name;
        while (true)
        {
            System.out.print("Enter the employee name: ");
            name = input.nextLine();


            if (name.matches("[a-zA-Z ]+")) {
                return name;
            } else {
                System.out.println("Invalid name. Please enter the letters and spaces only.");
            }
        }

    }

    public static String getValidatedNumber(Scanner input)
    {
        String number;

        while(true)
        {
            System.out.print("Enter the employee number in the format XXX-L (X: digits, L: A-M): ");
            number = input.nextLine();


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

    public static String getValidatedDate(Scanner input)
    {
        String date;

        while (true)
        {
            System.out.print("Enter the employee hire date (MM-DD-YYYY): ");
            date = input.nextLine();

            if (date.matches("\\d{2}-\\d{2}-\\d{4}"))
            {
                String[] parts = date.split("-");

                int month = Integer.parseInt(parts[0]);
                int day = Integer.parseInt(parts[1]);
                int year = Integer.parseInt(parts[2]);

                if (isValidDate(month, day, year))
                {
                    return date;
                }

                System.out.println("Invalid date values. Please ensure the date is valid.");
            }
            else
            {
                System.out.println("Invalid date format. Please use MM-DD-YYYY.");
            }
        }
    }

    public static boolean isValidDate(int month, int day, int year)
    {
        if (month < 1 || month > 12 || year < 1) 
        {
            return false;
        }
        
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year))
        {
            daysInMonth[1] = 29;
        }

        return day > 0 && day <= daysInMonth[month - 1];
    }

    
    public static boolean isLeapYear(int year) 
    {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }


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


    @Override
    public String toString()
    {

        return "Employee name: " + employeeName + "\n"
                + "Employee number: " + employeeNumber + "\n"
                + "Employee hire date: " + hireDate;

    }
}
