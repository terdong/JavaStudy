package dayx_capsulemonsters.player;

import dayx_capsulemonsters.monsters.Monster;

import java.util.ArrayList;

/**
 * Created by DongHee Kim on 2018-01-22 022.
 */
public class Player {
    private static final int MAX_MONSTER_COUNT = 2;

    private String name;
    private int gold;

    private ArrayList<Monster> monsterList = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public Monster summonMonster(int index) {
        if (index < monsterList.size()) {
            return monsterList.get(index);
        } else {
            System.out.println("소환 할 몬스터가 없습니다.");
            return null;
        }
    }

    public void addMonster(Monster monster) {
        if (monsterList.size() < MAX_MONSTER_COUNT) {
            monsterList.add(monster);
        } else {
            System.out.println("더 이상 몬스터를 추가할 수 없습니다.");
        }
    }

    public void releaseMonster(int index) {
        if (index < monsterList.size()) {
            monsterList.remove(index);
        } else {
            System.out.println("풀어줄 몬스터가 없습니다.");
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
    public int getGold(){
        return gold;
    }
}
