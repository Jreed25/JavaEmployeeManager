/**
 * Represents a shift supervisor with details about their annual salary and production bonus
 */

public class ShiftSupervisor extends Employee {
    private double annualSalary;
    private double productionBonus;

    public ShiftSupervisor(String name, String id, String date) 
    {
        super(name, id, date);
    }


    public void setAnnualSalary(double annualSalary) 
    {
        if (annualSalary >= 0)
            this.annualSalary = annualSalary;
        else
            throw new IllegalArgumentException("Salary cannot be negative.");
    }

    public void setProductionBonus(double productionBonus) 
    {
        if(productionBonus >= 0)
            this.productionBonus = productionBonus;
        else
            throw new IllegalArgumentException("Production bonus cannot be negative.");
    }


    public double getAnnualSalary()
    {
        return annualSalary;
    }

    public double getProductionBonus()
    {
        return productionBonus;
    }


    @Override
    public String toString() 
    {
        return String.format(
                "ShiftSupervisor { Name=%s, ID=%s, Date=%s, Annual Salary=$%.2f, Production Bonus=$%.2f }",
                getName(), getNumber(), getDate(), annualSalary, productionBonus);
    }
}

