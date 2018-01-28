package day14.inventory.items;

import day14.inventory.Player;

public abstract class Item {

    // 왠만하면 멤버 변수들은 public 또는 default 접근제한자로 하지마시고, protected 나 private으로 해주세요.
    protected String name;
    // value 값은 아이템의 종류에 따라 다른 가치로 쓰입니다.
    protected int value;
    protected int price;

    public Item(String name, int value, int price){
        this.name = name;
        this.value = value;
        this.price = price;
    }

    // 아이템을 인벤토리에서 사용할 때 호출하는 메소드
    abstract public void use();

    public void sell(Player player){
        player.increaseMoney(price);
    }

    public String getItemName(){
        return name;
    }
}
