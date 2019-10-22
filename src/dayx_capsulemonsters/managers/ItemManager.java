package dayx_capsulemonsters.managers;

import dayx_capsulemonsters.items.Item;
import dayx_capsulemonsters.items.potions.HealingPotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by DongHee Kim on 2018-01-29 029.
 */
public class ItemManager {
    private Random random;
    private ArrayList<Item> itemArrayList;
    private HashMap<String, Item> itemHashMap;

    public ItemManager(Random random){
        this.random = random;
        itemArrayList = new ArrayList<>();
        itemHashMap = new HashMap<>();

        initialize();
    }

    private void initialize(){

        addItem(new HealingPotion("힐링포션", 10, 10));


    }

    public void addItem(Item item){
        itemArrayList.add(item);
        itemHashMap.put(item.getName(), item);
    }

    public Item getItem(String name){
        return itemHashMap.get(name);
    }

    public Item getRandomItem(){
        return itemArrayList.get(random.nextInt(itemArrayList.size()));
    }
}
