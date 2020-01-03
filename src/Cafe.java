public class Cafe {
    String cafeName;
    public static int totalMoney = (int)(Math.random()*100);

    public Cafe(String name){
        cafeName = name;
        System.out.println("Welcome to "+ cafeName+ "!");
    }

    public void startTheCafe(){
        System.out.println("We need to hire a crew!");
        }

    public void howMuchMoneyLeft(){
        System.out.println("The total cafe money is "+ totalMoney + " coin(s)");
    }

    public void startTheDay(){
        System.out.println("Good morning! Today we have in our menu some special yummies!");
        howMuchMoneyLeft();
    }

}
