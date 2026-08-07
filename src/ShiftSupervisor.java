/**
 * Represents a shift supervisor with details about their annual salary and production bonus
 */

public class ShiftSupervisor extends Employee {double annualSalary,productionBonus;

    public ShiftSupervisor(String name, String id, String date) {
        super(name, id, date);
    }


    // Mutator methods

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    public void setProductionBonus(double productionBonus) {
        this.productionBonus = productionBonus;
    }


    @Override
    public String toString() {
        return String.format(
                "ShiftSupervisor { Name=%s, ID=%s, Date=%s, Annual Salary=$%.2f, Production Bonus=$%.2f }",
                getName(), getNumber(), getDate(), annualSalary, productionBonus);
    }


    public static void main(String[] args){


        ShiftSupervisor worker1 = new ShiftSupervisor("Joe Jonas", "434-F", "10-31-2005");
        ShiftSupervisor worker2 = new ShiftSupervisor("John Wiginton","565-G","12-25-2005");


        worker1.setAnnualSalary(56000);
        worker1.setProductionBonus(7800);

        worker2.setAnnualSalary(75000);
        worker2.setProductionBonus(9000);


        System.out.println(worker1);
        System.out.println(worker2);
    }
}

