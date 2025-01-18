/**
 * Represents a shift supervisor with details about their annual salary and production bonus
 */

public class ShiftSupervisor extends Employee {double annualSalary,productionBonus;

    // Calling parent constructor
    public ShiftSupervisor(String name, String id, String date) {
        super(name, id, date);
    }
    public ShiftSupervisor() {
        super("john", "123-A", "11-11-2005");
    }


// Mutator methods for the Shift Supervisors details

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    public void setProductionBonus(double productionBonus) {
        this.productionBonus = productionBonus;
    }

    // Returns a string representation of Shift Supervisor
    @Override
    public String toString() {
        return String.format(
                "ShiftSupervisor { Name=%s, ID=%s, Date=%s, Annual Salary=$%.2f, Production Bonus=$%.2f }",
                getName(), getNumber(), getDate(), annualSalary, productionBonus);
    }


    public static void main(String args[]){

// Objects created
        ShiftSupervisor worker1 = new ShiftSupervisor("Joe Jonas", "434-F", "10-31-2005");
        ShiftSupervisor worker2 = new ShiftSupervisor("John Wiginton","565-G","12-25-2005");

// Calling setter methods
        worker1.setAnnualSalary(56000);
        worker1.setProductionBonus(7800);

        worker2.setAnnualSalary(75000);
        worker2.setProductionBonus(9000);

// Printing data
        System.out.println(worker1);
        System.out.println(worker2);
    }
}

