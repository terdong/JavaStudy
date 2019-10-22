package dayx_capsulemonsters.managers;

import dayx_capsulemonsters.monsters.Goblin;
import dayx_capsulemonsters.monsters.Monster;
import dayx_capsulemonsters.player.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

/**
 * Created by DongHee Kim on 2018-01-25 025.
 */
public class MonsterManager {

    private Random random;
    private ArrayList<Monster> monsterArrayList;
    private ItemManager itemManager;

    public MonsterManager(Random random, ItemManager itemManager){
        this.random = random;
        this.itemManager = itemManager;
        monsterArrayList = new ArrayList<>();

        monsterArrayList.add(new Goblin(itemManager.getRandomItem()));
    }

    public Monster getRandomMonster() throws CloneNotSupportedException {
        return (Monster)monsterArrayList.get(0).clone();
    }

}
