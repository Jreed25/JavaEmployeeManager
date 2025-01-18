import java.util.Scanner;

/**
 * Demonstrates the functionality of the ProductionWorker class.
 */

public class ProductionWorkerDemo {


    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        char choice;

        // Repeat the loop until the user wants to exit
        do
        {

            // Gather employee details from the user
            String empName = ProductionWorker.getValidatedName(input);
            String empNumber = ProductionWorker.getValidatedNumber(input);
            String date = ProductionWorker.getValidatedDate(input);
            int sh = ProductionWorker.getValidatedShift(input);
            double rate = ProductionWorker.getValidatedPayRate(input);

            // Create and display the ProductionWorker object
            ProductionWorker worker = new ProductionWorker(empName, empNumber, date, sh, rate);
            System.out.println("\nDetails of the employee: ");
            System.out.println(worker);

            // Ask user if they want to create another or exit
            System.out.print("\nDo you want to demonstrate another Production Worker object? (Y/N): ");
            choice = input.nextLine().charAt(0);
            System.out.println();
        } while(choice == 'Y' || choice == 'y');
    }
}
