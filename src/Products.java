import java.util.ArrayList;
import java.util.List;

public class Products {
    public String name;
    public int price;
    public int timeToPrepare;
    public static List<Products> prod = new ArrayList<>();

    public String makeAYummyWord() {
        String[] yummywords = new String[]{"delicious", "tasty", "wonderful",
                "orgasmic", "fantastic", "fair-without-hair", "hot-hot-hot", "desperate", "cool", "happy", "soft"};
        return yummywords[(int)(Math.random()*10)];
    }

    public Products(String name, int timeToPrepare){
        this.name = name;
        this.price = (int)(Math.random()*50);
        this.timeToPrepare = timeToPrepare;
        prod.add(this);
        System.out.println("Oh, this is "+ makeAYummyWord() + " " + name + ", it costs "+ price +" coins.");
    }

    public void orderOfProduct(){
        Cafe.totalMoney += price;
        System.out.println("Here is your " + makeAYummyWord() + " " + name + "." );
    }
}