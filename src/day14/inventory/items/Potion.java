package day14.inventory.items;

import day14.inventory.Player;

public class Potion extends Item{
    public Potion(String name, int value, int price) {
        super(name, value, price);
    }

    // Item 클래스의 use 메소드를 오버라이드 한다.
    // 매개변수로 받은 플레이어의 increaseHealthPoint 메소드를 호출하면서 Potion의 value 멤버변수를 매개변수로 넘겨준다.
    // 아이템이 제대로 사용되었다는 것을 use 메소드를 호출한 쪽에 알려주기 위해 return 값을 true로 반환한다.
    @Override
    public boolean use(Player player) {
        player.increaseHealthPoint(value);
        return true;
    }
}
