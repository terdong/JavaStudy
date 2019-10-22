package dayx_capsulemonsters.player;

import dayx_capsulemonsters.items.Armor;
import dayx_capsulemonsters.items.Item;
import dayx_capsulemonsters.items.Weapon;
import dayx_capsulemonsters.utility.Dice;

import java.util.ArrayList;

/**
 * Created by DongHee Kim on 2018-01-22 022.
 */
public class Player extends BattleUnit {
    private static final int MAX_INVENTORY_COUNT = 10;

    private static final int ARMOR_HELMET_INDEX = 0;
    private static final int ARMOR_BODY_INDEX = 1;
    private static final int ARMOR_GLOVES_INDEX = 2;
    private static final int ARMOR_BOOTS_INDEX = 3;
    private static final int ARMOR_SHILED_INDEX = 4;
    private static final int ARMOR_RING_INDEX = 5;

    private ArrayList<Item> inventory = new ArrayList<>();

    private Dice diceForMove;

    private Weapon weapon;

    //TODO: 배열을 사용하면 null 체크를 해야하는 수고가 있기 때문에, 추후 ArrayList 타입으로 교체해준다.
    private Armor[] armors = new Armor[6];

    private int exp;

    public Player(String name) {
        super(name,50,1,0, new Dice(6,1));
        diceForMove = new Dice(6,1);
    }

    public boolean addItem(Item item){
        if(inventory.size() < MAX_INVENTORY_COUNT) {
            return inventory.add(item);
        }else{
            System.out.println("인벤토리가 꽉 찼습니다. 더 이상 아이템을 추가할 수 없습니다.");
            return false;
        }
    }

    public Item takeOutItem(int index){
        if (inventory.size() < MAX_INVENTORY_COUNT) {
            return inventory.remove(index);
        } else {
            System.out.println("꺼낼 아이템이 없습니다.");
            return null;
        }
    }

    public void increaseGold(int gold){
        this.gold += gold;
    }
    public void decreaseGold(int gold){
        this.gold = Math.max(this.gold - gold, 0);
    }
    public boolean checkEnoughGold(int gold){
        return this.gold >= gold;
    }

    public Dice getDiceForMove() {
        return diceForMove;
    }

    // x = level, y = exp
    // y = (x * x ) * 2 + 100
    // x = sqrt(y/2 - 100/2)
    public int getLevel(){
        return (int)Math.sqrt(exp / 2 - 100 / 2);
    }

    public void increaseExp(int exp){
        this.exp += exp;
    }

    public int getAllArmorPoint(){
        int armorSum = 0;
        for(int i=0; i<armors.length; ++i){
            Armor armor = armors[i];
            if(armor != null) {
                armorSum += armor.getArmorPoint();
            }
        }
        return armorSum;
    }

}
