public class Cleaner extends Worker {

    public Cleaner (String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        personalMoney = 0;
        workers.add(this);
        System.out.println("Life is pain.");
    }

    private  Cleaner(){}

    public void clean(){
        System.out.println("Legs up!!!!!");
    }





}
