public class Barista extends Worker {
    private int levelOfCoffeeMaking = 0;
    public Barista (String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
        personalMoney = 0;
        workers.add(this);
        System.out.println("You have a new barista " + name + ".");
    }

    public void setLevelOfCoffeeMaking(int level){
        this.levelOfCoffeeMaking = level;
    }

    public int getLevelOfCoffeeMaking(){
        return levelOfCoffeeMaking;
    }
}
