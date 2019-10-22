package day14.inventory;

import day14.inventory.items.*;

public class Player {

    // 최대 아이템 소지 개수를 상수로 정의
    private static final int MAX_ITEM_COUNT = 8;

    // 플레이어 이름
    private String name;
    // 픞레이어 체력
    private int healthPoint;
    // 플레이어 소지금
    private int money;

    // 플레이어 아이템 인벤토리
    private Item[] inventory;
    // 플레이어 장비(무기) 장착 슬롯
    private IWeapon leftHand;
    // 플레이어 장비(갑옷) 장착 슬롯
    private IArmor bodyArmor;

    // 인벤토리의 아이템 추가를 위한 인덱스
    private int inventoryIndex;

    public Player() {
        this.name = "바바";
        this.healthPoint = 10;
        this.money = 0;
        this.inventory = new Item[MAX_ITEM_COUNT];

        //leftHand = new Sword("맨손",1,1);
        //bodyArmor = new Armor("맨몸",1,1);
    }

    // 아이템 추가 메소드
    public void addItem(Item item) {
        if (inventoryIndex < inventory.length) {
            inventory[inventoryIndex++] = item;
        } else {
            System.out.println("더 이상 아이템을 추가할 수 없습니다.");
        }
    }

    // 돈 증가시키는 메소드
    public void increaseMoney(int money) {
        this.money += money;
        System.out.println("플레이어의 돈이 " + money + " 만큼 증가하였습니다.");
        System.out.println("플레이어 잔액: " + this.money);
    }

    // 플레이어 체력 증가 메소드
    public void increaseHealthPoint(int healthPoint) {
        this.healthPoint += healthPoint;
        System.out.printf("플레이어의 체력이 %d 만큼 회복되었습니다. 현재 체력: %d\n", healthPoint, this.healthPoint);
    }

    // 무기 장착하기
    public void setLeftHand(Item item) {
        if (item instanceof IWeapon) {
            this.leftHand = (IWeapon) item;
            System.out.printf("%s을 장착 했습니다.\n", item.getItemName());
        } else {
            System.out.printf("이 아이템(%s)은 장착할 수 없습니다.\n", item.getItemName());
        }
    }

    // 갑옷 장착하기
    public void setBodyArmor(Item item) {
        if (item instanceof IArmor) {
            this.bodyArmor = (IArmor) item;
            System.out.printf("%s을 장착 했습니다.\n", item.getItemName());
        } else {
            System.out.printf("이 아이템(%s)은 장착할 수 없습니다.\n", item.getItemName());
        }
    }

    // 플레이어 정보 출력
    public void printPlayerInfo() {
        System.out.println();

        String weaponName = leftHand != null ?  ((Item) leftHand).getItemName() : "없음";
        String armorName = bodyArmor != null ?  ((Item) bodyArmor).getItemName() : "없음";

        System.out.printf("이름: %s\n체력:%d\n소지금:%d\n무기:%s, 갑옷:%s\n아이템갯수:%d\n", name, healthPoint, money,weaponName, armorName, inventoryIndex);
        System.out.println();
    }

    // 인벤토리에 있는 아이템 목록 출력
    public void printInventory() {
        System.out.println();
        System.out.println("아이템 목록");
        for (int i = 0; i < inventoryIndex; ++i) {
            Item item = inventory[i];
            if (item != null) {
                System.out.printf("%d. %s\n", i + 1, item.getItemName());
            }
        }
        System.out.println();
    }

    // 외부에서 이 메소드를 통해 사용할 아이템의 index를 전달한다.
    public void useItem(int itemId) {
        System.out.print("아이템 사용: ");
        if (itemId < inventoryIndex) {
            boolean result = inventory[itemId].use(this);
            // 만약 아이템이 제대로 사용 되었다면, 사용된 아이템을 제거해주어야 한다.
            if (result) {
                inventory[itemId] = null;
            }
        } else {
            System.out.println("사용할 아이템이 없습니다.");
        }
    }

    // 외부에서 이 메소드를 통해 판매할 아이템의 index를 전달한다.
    public void sellItem(int itemId) {
        System.out.print("아이템 판매: ");
        if (itemId < inventoryIndex) {
            boolean result = inventory[itemId].sell(this);
            // 만약 아이템이 제대로 판매 되었다면, 판매된 아이템을 제거해주어야 한다.
            if (result) {
                inventory[itemId] = null;
            }
        } else {
            System.out.println("판매할 아이템이 없습니다.");
        }
    }

    // 플레이어의 공격 메소드
    public void attack() {
        if (leftHand != null) {
            leftHand.attack();
        } else {
            System.out.println("장착한 무기가 없습니다.");
        }

    }

    // 플레이어의 방어 메소드
    public void defence() {
        if (bodyArmor != null) {
            bodyArmor.defence();
        } else {
            System.out.println("장착한 갑옷이 없습니다.");
        }
    }
}
