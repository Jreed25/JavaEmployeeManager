import java.util.ArrayList;
import java.util.Scanner;

/**
 * Demonstrates the functionality of the ProductionWorker class.
 */

public class Main {

    public static void main(String[] args)
    {
        ArrayList<ShiftSupervisor> supervisors =
            SupervisorManager.createSupervisors();

        ArrayList<ProductionWorker> workers =
            ProductionWorkerManager.createWorkers(supervisors);
        
        Scanner input = new Scanner(System.in);

        int choice;

    do
    {
        System.out.println("Employee Management System:\n\n");
        System.out.println("1. Worker\n");
        System.out.println("2. Shift Supervisor\n");
        System.out.println("3. Exit\n");
        choice = input.nextLine();

        switch (choice)
        {
            case 1:
                employeeLogin(input, workers);
                break;

            case 2:
                supervisorLogin(input, workers, supervisors);
                break;

            case 3:
                System.out.println("Goodbye.");
                break;

            default:
                System.out.println("Invalid input.");
        }

    } while (choice != 3);

    input.close();
    

    /*
        do
        {
            String empName = Employee.getValidatedName(input);
            String empNumber = Employee.getValidatedNumber(input);
            String date = Employee.getValidatedDate(input);
            ShiftSupervisor supervisor = 
                ProductionWorker.getValidatedSupervisor(input, supervisors);
            int sh = ProductionWorker.getValidatedShift(input);
            double rate = ProductionWorker.getValidatedPayRate(input);


            ProductionWorker worker = 
                new ProductionWorker(empName, empNumber, date, supervisor, sh, rate);
            System.out.println("\nWorker Details: ");
            System.out.println(worker);

            
            System.out.print("\nDo you want to create another Production Worker object? (Y/N): ");
            choice = input.nextLine().charAt(0);
            System.out.println();

        } while(choice == 'Y' || choice == 'y');

        input.close();
        */
    }

    private static void workerMenu(Scanner input, ArrayList<ProductionWorker> workers)
    {
        int choice;
        
        System.out.println("Available Workers:");

        for(int i = 0; i < workers.size(); i++)
        {
            System.out.println((i + 1) + ". " + workers.get(i).getName());
        }

        System.out.println("Choose a worker: ");
        int workerChoice = input.parseInt(input.nexline());

        

        for(int i = 0; )
        System.out.println("1. View My Information"); 
        System.out.println("2. View My Shifts");
        System.out.println("3. Log Out");
        choice = input.nextline();

        /*
        do
        {
            switch(choice)
            {
                case 1: 
            }
        } while(choice != 3)
        */
    }

    private static void supervisorMenu(Scanner input)
    {
        int choice;

        System.out.println("1. View My Information"); 
        System.out.println("2. Edit Employee Details");
        System.out.println("3. View Employee Details");
        System.out.println("4. Log Out");
        choice = input.nextline();

        /*
        do
        {
            switch(choice)
            {
                case 1:
            }
        } while(choice != 3)
        */
    }
}