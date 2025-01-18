import java.util.Scanner;

/**
 * Represents a Production Worker with a shift type and hourly pay rate.
 * Inherits basic employee details from the Employee class.
 */

public class ProductionWorker extends Employee {
    // Constants declarations
    public final int DAY_SHIFT = 1;
    public final int NIGHT_SHIFT = 2;

    // Data fields
    private int shift;
    private double hourlyPayRate;


    // Parameterized constructor for Production Worker
    public ProductionWorker(String empName, String empNumber, String date, int sh, double rate)
    {
        super(empName, empNumber, date);
        setShift(sh);
        setPayRate(rate);
    }

// Accessor methods

    // Validates and returns the production workers shift
    public static int getValidatedShift(Scanner input) {
        int shift;
        while (true) {
            // use try, catch to check for valid input
            try
            {
                System.out.print("Enter the shift (1 for day, 2 for night): ");
                shift = Integer.parseInt(input.nextLine());
                if (shift == 1 || shift == 2)
                    return shift;
                else
                    System.out.println("Invalid shift. Shift must be 1 or 2");

            }
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Shift must be 1 or 2");
            }
        }
    }

    // Validates and returns the Production Workers pay rate
    public static double getValidatedPayRate(Scanner input)
    {
        double payRate;
        while(true) {
            // use try, catch to check for valid input
            try {
                System.out.print("Enter your hourly pay rate: $");
                payRate = Double.parseDouble(input.nextLine());
                if (payRate > 0) {
                    return payRate;
                } else {
                    System.out.println("Pay rate must be a positive number. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }


    // Mutator methods for the Production Worker details
    public void setShift(int sh)
    {
        shift = sh;
    }
    public void setPayRate(double rate)
    {
        hourlyPayRate = rate;
    }

    // Returns a string representation of Production Worker
    @Override
    public String toString()
    {
        String result;

        result = super.toString() + "\n";

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
