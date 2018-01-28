package day14.inventory.items;

public class Sword extends Item implements IWeapon{
    public Sword(String name, int value, int price) {
        super(name, value, price);
    }

    @Override
    public void use() {
        System.out.println("아무일도 일어나지 않았다.");
    }

    @Override
    public void attack() {
        System.out.println("상대를 공격합니다.");
    }
}
