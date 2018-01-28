package day14.inventory.items;

public class Armor extends Item implements IArmor{
    public Armor(String name, int value, int price) {
        super(name, value, price);
    }

    @Override
    public void use() {
        System.out.println("아무일도 일어나지 않았다.");
    }

    @Override
    public void defence() {
        System.out.println("상대의 다음 공격을 막습니다.");
    }
}
