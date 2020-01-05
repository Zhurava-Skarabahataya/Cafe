import java.util.ArrayList;
import java.util.List;

public abstract class Worker {  //I made this class abstract
    public String name;
    public int age;
    public int salary;
    public int personalMoney;
    public static List<Worker> workers = new ArrayList<>();

    public static void printWorkers(){ //Prints list of workers.
        System.out.println("We have a nice crew: ");
        for (Worker w: workers){
            System.out.println(w.name);
        }
    }

    public abstract void getSalary();

}
