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
    // 아이템을 사용하게 할 플레이어를 매개변수로 받음
    // 아이템이 제대로 사용 되었다면 true를 반환하고, 아니면 false 반환
    abstract public boolean use(Player player);

    // 아이템을 판매할 때 호출되는 메소드
    public boolean sell(Player player){
        player.increaseMoney(price);
        return true;
    }

    // 아이템의 이름을 반환하는 메소드
    public String getItemName(){
        return name;
    }
}
