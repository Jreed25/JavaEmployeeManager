import java.util.Scanner;

/**
 * Demonstrates the functionality of the ProductionWorker class.
 */

public class ProductionWorkerDemo {


    public static void main(String[] args)
    {
 
        Scanner input = new Scanner(System.in);
        char choice;

    
        do
        {
            String empName = Employee.getValidatedName(input);
            String empNumber = Employee.getValidatedNumber(input);
            String date = Employee.getValidatedDate(input);
            int sh = ProductionWorker.getValidatedShift(input);
            double rate = ProductionWorker.getValidatedPayRate(input);


            ProductionWorker worker = 
                new ProductionWorker(empName, empNumber, date, sh, rate);
            System.out.println("\nEmployee Details: ");
            System.out.println(worker);

            
            System.out.print("\nDo you want to create another Production Worker object? (Y/N): ");
            choice = input.nextLine().charAt(0);
            System.out.println();

        } while(choice == 'Y' || choice == 'y');


        input.close();
    }
}
