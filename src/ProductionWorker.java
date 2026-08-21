import java.util.Scanner;
import java.util.ArrayList;

/**
 * Represents a Production Worker with a shift type and hourly pay rate.
 * Inherits basic employee details from the Employee class.
 */

public class ProductionWorker extends Employee {
    public static final int DAY_SHIFT = 1;
    public static final int NIGHT_SHIFT = 2;

    private ShiftSupervisor supervisor;
    private int shift;
    private double hourlyPayRate;


    public ProductionWorker(String empName, String empNumber, String date,
    ShiftSupervisor supervisor, int sh, double rate)
    {
        super(empName, empNumber, date);
        setSupervisor(supervisor);
        setShift(sh);
        setPayRate(rate);
    }


    public static ShiftSupervisor getValidatedSupervisor(Scanner input, ArrayList<ShiftSupervisor> supervisors)
    {
        int supervisorNum;

        while(true)
        {
            try{

                System.out.println("Available Shift Supervisors: ");

                for(int i = 0; i < supervisors.size(); i++)
                {
                    System.out.println((i + 1) + ". " + supervisors.get(i).getName());
                }

                System.out.print("Enter the number of the supervisor: ");
                supervisorNum = Integer.parseInt(input.nextLine());
                if(supervisorNum >= 1 && supervisorNum <= supervisors.size())
                {
                    return supervisors.get(supervisorNum - 1);
                } else
                {
                    System.out.println("Invalid supervisor selection. Please choose a number between 1 and " + supervisors.size() + ".");
                } 
            } catch (NumberFormatException e)
            {
                System.out.println("Invalid supervisor selection. Please choose a number between 1 and " + supervisors.size() + ".");
            }

        }
    }
    
    public static int getValidatedShift(Scanner input) 
    {
        int shift;
        
        while (true) 
        {
            try
            {
                System.out.print("Enter the shift (1 for day, 2 for night): ");
                shift = Integer.parseInt(input.nextLine());
                if (shift == DAY_SHIFT || shift == NIGHT_SHIFT)
                {
                    return shift;
                } else
                {
                    System.out.println("Invalid shift. Shift must be 1 or 2");
                }
            } catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Shift must be 1 or 2");
            }
        }
    }

    public static double getValidatedPayRate(Scanner input)
    {
        double payRate;

        while(true) 
        {
            try 
            {
                System.out.print("Enter the hourly pay rate: $");
                payRate = Double.parseDouble(input.nextLine());
                if (payRate > 0) 
                {
                    return payRate;
                } else 
                {
                    System.out.println("Pay rate must be a positive number. Try again.");
                }
            } catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }


    public void setSupervisor(ShiftSupervisor supervisor)
    {
        this.supervisor = supervisor;
    }

    public void setShift(int sh)
    {
        shift = sh;
    }
    
    public void setPayRate(double rate)
    {
        hourlyPayRate = rate;
    }


    @Override
    public String toString()
    {
        String result;

        result = super.toString() + "\n";

        result += "Supervisor: " + supervisor.getName() + "\n";

        if(shift == DAY_SHIFT)
            result += "Shift: Day\n";
        else if(shift == NIGHT_SHIFT)
            result += "Shift: Night\n";
        else
            result += "Shift: Invalid\n";

        result += "Hourly pay rate: " + String.format("$%.2f", hourlyPayRate);

        return result;
    }
}
