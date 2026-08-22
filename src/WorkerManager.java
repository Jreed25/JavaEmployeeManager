import java.util.ArrayList;

public class WorkerManager 
{
    public static ArrayList<ProductionWorker> createWorkers(
            ArrayList<ShiftSupervisor> supervisors)
    {
        ArrayList<ProductionWorker> workers = new ArrayList<>();

        ProductionWorker worker1 =
            new ProductionWorker(
                    "Josh Heem",
                    "214-A",
                    "08-20-2014",
                    supervisors.get(0),
                    ProductionWorker.DAY_SHIFT,
                    20.00);

        ProductionWorker worker2 =
            new ProductionWorker(
                    "Mike Wilson",
                    "479-B",
                    "07-15-2012",
                    supervisors.get(1),
                    ProductionWorker.NIGHT_SHIFT,
                    23.25);

        ProductionWorker worker3 =
            new ProductionWorker(
                    "Garrett Mickin",
                    "123-A",
                    "10-13-2018",
                    supervisors.get(3),
                    ProductionWorker.DAY_SHIFT,
                    19.74);

        ProductionWorker worker4 =
            new ProductionWorker(
                    "David Neest",
                    "456-B",
                    "01-04-2020",
                    supervisors.get(4),
                    ProductionWorker.NIGHT_SHIFT,
                    24.56);

        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);

        return workers;
    }

    public void addWorker(ProductionWorker worker)
    {
        workers.add(worker);
    }

    public ArrayList<ProductionWorker> getWorkers()
    {
        return workers;
    }
}