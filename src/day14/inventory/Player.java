package day14.inventory;

import day14.inventory.items.*;

public class Player {

    private static final int MAX_ITEM_COUNT = 8;

    private String name;
    private int healthPoint;
    private int money;

    private Item [] inventory;
    private IWeapon leftHand;
    private IArmor body;

    private int inventoryIndex;

    public Player(){
        this.name = "바바";
        this.healthPoint = 10;
        this.money = 0;
        this.inventory = new Item[MAX_ITEM_COUNT];

        leftHand = new Sword("맨손",1,1);
        body = new Armor("맨몸",1,1);
    }

    public void addItem(Item item){
        if(inventoryIndex < inventory.length) {
            inventory[inventoryIndex++] = item;
        }else{
            System.out.println("더 이상 아이템을 추가할 수 없습니다.");
        }
    }

    public void increaseMoney(int money){
        this.money += money;
        System.out.println("플레이어의 돈이 " + money + " 만큼 증가하였습니다.");
        System.out.println("플레이어 잔액: " + this.money);
    }

    public void setLeftHand(Item item){
        if(item instanceof IWeapon){
            this.leftHand = (IWeapon)item;
            System.out.printf("%s을 장착 했습니다.\n", item.getItemName());
        }else{
            System.out.printf("이 아이템(%s)은 장착할 수 없습니다.\n", item.getItemName());
        }
    }

    public void setBody(Item item){
        if(item instanceof IArmor){
            this.body = (IArmor)item;
            System.out.printf("%s을 장착 했습니다.\n", item.getItemName());
        }else{
            System.out.printf("이 아이템(%s)은 장착할 수 없습니다.\n", item.getItemName());
        }
    }

    public void printPlayerInfo(){
        System.out.println();

        System.out.printf("이름: %s\n체력:%d\n소지금:%d\n무기:%s,갑옷:%s\n아이템갯수:%d\n", name, healthPoint, money, ((Item)leftHand).getItemName(), ((Item)body).getItemName(), inventoryIndex);

        System.out.println("아이템 목록");
        for(int i=0; i<inventoryIndex; ++i){
            System.out.printf("%d. %s\n",i+1, inventory[i].getItemName());
        }
        System.out.println();
    }

}
