package day14.inventory.items;

import day14.inventory.Player;

public class Potion extends Item{
    public Player player;
    public Potion(String name, int value, int price) {
        super(name, value, price);
    }

    @Override
    public void use() {
        System.out.println("플레이어의 체력을 " + value + " 만큼 회복시킵니다.");
    }
}
