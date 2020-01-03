import java.util.ArrayList;
import java.util.List;

public class Worker {
    public String name;
    public int age;
    public int salary;
    public int personalMoney;
    public static List<Worker> workers = new ArrayList<>();

    public void printWorkers(){
        System.out.println("We have a nice crew: ");
        for (Worker w: workers){
            System.out.println(w.name);
        }
    }



}
