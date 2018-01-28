package day14.inventory;

import day14.inventory.items.Armor;
import day14.inventory.items.Item;
import day14.inventory.items.Potion;
import day14.inventory.items.Sword;

public class InventoryLauncher {
    public static void main(String[] args) {

        Player player = new Player();
        player.increaseMoney(100);

        Item sword = new Sword("단검", 10, 10);
        Item healingPosion = new Potion("회복물약", 10, 10);
        Item armor = new Armor("갑빠", 10, 10);

        player.addItem(sword);
        player.addItem(healingPosion);
        player.addItem(armor);

        player.printPlayerInfo();

        // 아이템 장착 코드
        player.setLeftHand(healingPosion);
        player.setLeftHand(sword);
        player.setBody(sword);
        player.setBody(armor);

        player.printPlayerInfo();


    }
}
