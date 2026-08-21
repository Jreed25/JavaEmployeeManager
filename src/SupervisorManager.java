import java.util.ArrayList;

/**
 * Creates and manages the shift supervisors available to employees.
 */

public class SupervisorManager
{
    public static ArrayList<ShiftSupervisor> createSupervisors()
    {
        ArrayList<ShiftSupervisor> supervisors = new ArrayList<>();
        
        ShiftSupervisor supervisor1 =
                new ShiftSupervisor("Robert Hinge", "661-N", "03-04-2004");
        supervisor1.setAnnualSalary(204000);
        supervisor1.setProductionBonus(19000);

        ShiftSupervisor supervisor2 =
                new ShiftSupervisor("James Smith", "467-N", "10-12-2005");
        supervisor2.setAnnualSalary(152000);
        supervisor2.setProductionBonus(12000);

        ShiftSupervisor supervisor3 =
                new ShiftSupervisor("Joe Dean", "185-N", "09-23-2010");
        supervisor3.setAnnualSalary(123000);
        supervisor3.setProductionBonus(10000);

        ShiftSupervisor supervisor4 =
                new ShiftSupervisor("Thomas Wood", "983-N", "11-30-2013");
        supervisor4.setAnnualSalary(94000);
        supervisor4.setProductionBonus(8000);

        supervisors.add(supervisor1);
        supervisors.add(supervisor2);
        supervisors.add(supervisor3);
        supervisors.add(supervisor4);

        return supervisors;
    }
}