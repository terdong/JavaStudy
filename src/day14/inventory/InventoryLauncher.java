package day14.inventory;

import day14.inventory.items.Armor;
import day14.inventory.items.Item;
import day14.inventory.items.Potion;
import day14.inventory.items.Sword;

public class InventoryLauncher {
    public static void main(String[] args) {

        System.out.println(">> 테스트 1: 플레이어 생성");
        Player player = new Player();
        player.printPlayerInfo();

        System.out.println(">> 테스트 2: 돈 증가 시키기");
        player.increaseMoney(100);

        Item sword = new Sword("단검", 10, 10);
        Item healingPosion = new Potion("회복물약", 10, 10);
        Item healingPosion2 = new Potion("회복물약", 10, 10);
        Item armor = new Armor("가죽 갑옷", 10, 10);

        System.out.println("\n>> 테스트 3: 아이템 추가하기");
        player.addItem(sword);
        player.addItem(healingPosion);
        player.addItem(healingPosion2);
        player.addItem(armor);

        player.printPlayerInfo();
        player.printInventory();

        System.out.println(">> 테스트 4: 아이템 장착 전 공격 및 방어 메소드 호출 해보기");
        player.attack();
        player.defence();

        System.out.println();

        // 아이템 장착 코드
        System.out.println(">> 테스트 5: 물약을 무기 슬롯에 장착하기");
        player.setLeftHand(healingPosion);
        System.out.println(">> 테스트 6: 단검을 무기 슬롯에 장착하기");
        player.setLeftHand(sword);
        player.printPlayerInfo();

        System.out.println(">> 테스트 7: 단검을 갑옷 슬롯에 장착하기");
        player.setBodyArmor(sword);
        System.out.println(">> 테스트 8: 가죽 갑옷을 갑옷 슬롯에 장착하기");
        player.setBodyArmor(armor);
        player.printPlayerInfo();

        // 일부러 검을 사용(?) 해본다.
        System.out.println(">> 테스트 9: 단검을 사용해보기");
        player.useItem(0);

        // 회복 포션 사용
        System.out.println(">> 테스트 10: 회복 물약을 사용해보기");
        player.useItem(1);

        System.out.println("\n>> 테스트 11: 한개만 남은 회복 물약 확인");
        player.printInventory();

        System.out.println(">> 테스트 12: 인벤토리에 없는 아이템 슬롯을 사용해보기");
        // 일부러 없는 아이템 인덱스를 호출
        player.useItem(9);

        System.out.println();

        System.out.println(">> 테스트 13: 하나 남은 회복 물약을 팔아보기");
        // 아이템 판매
        player.sellItem(2);

        player.printInventory();

        System.out.println(">> 테스트 14: 아이템 장착 후 공격 및 방어 메소드 호출 해보기");
        player.attack();
        player.defence();


    }
}
