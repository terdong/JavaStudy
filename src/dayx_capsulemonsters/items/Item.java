package dayx_capsulemonsters.items;

/**
 * Created by DongHee Kim on 2018-01-25 025.
 */
public abstract class Item {

    private String name;
    private int price;
    private int value;

    public Item(String name, int price, int value){
        this.name = name;
        this.price = price;
        this.value = value;
    }

    abstract public void use();

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getValue() {
        return value;
    }
}
