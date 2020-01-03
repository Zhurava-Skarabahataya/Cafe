public class MyMainClass {
    public static void main (String[] args){
        Cafe myCafe = new Cafe ("Caffeine");
        Administrator admin = new Administrator("Petrovna", 34, 100){};
        myCafe.startTheCafe();
        Barista jack = new Barista("Jack", 18, 20);
        Cleaner babaVasya = new Cleaner("Baba Vasya", 114, 12){};
        myCafe.startTheDay();
        Products coffee = new Products("Coffeusius", 100);
        Products tea = new Products("Teeeea", 30);
        Worker w = new Worker();
        w.printWorkers();

        for (int i = 0; i < (int)(Math.random()*20); i++){
            coffee.orderOfProduct();
            tea.orderOfProduct();
        }

        admin.paySalary();
        myCafe.howMuchMoneyLeft();
    }
}
