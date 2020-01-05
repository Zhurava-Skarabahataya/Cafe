public class Administrator extends Worker {
    public Administrator (String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        personalMoney = 100;
        workers.add(this);
    }

    private  Administrator(){}

    public void paySalary(){
        System.out.println("Oh, " + name+ " now has to pay salary.");

        for (Worker w : workers){
            Cafe.totalMoney -=w.salary;
            w.personalMoney += w.salary;
            System.out.println(w.name + " gets " + w.salary + " coins.");
        }

        if (Cafe.totalMoney > 100){
            System.out.println("Everybody worked well. Here are some extra for the guys.");
            for (Worker a : workers){
                a.personalMoney += 15;
            }
        }

        else if (Cafe.totalMoney > 50){
            System.out.println(name + " has a gift for herself!");
            personalMoney +=15;
        }
    }

    @Override
    public void getSalary() {
        System.out.println("My salary is a secret.");
    }
}
