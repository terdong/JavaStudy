package dayx_capsulemonsters.monsters;

import dayx_capsulemonsters.items.Item;
import dayx_capsulemonsters.player.BattleUnit;
import dayx_capsulemonsters.skills.Skill;
import dayx_capsulemonsters.utility.Dice;

/**
 * Created by DongHee Kim on 2018-01-22 022.
 */
public abstract class Monster extends BattleUnit implements Cloneable{

    protected Item reward;

    protected Monster(String name, int healthPoint, int armorPoint, int gold, Dice diceForBattle){
        super(name,healthPoint,armorPoint,gold,diceForBattle);
    }

    public Item getReward(){
        return reward;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public Object clone() throws CloneNotSupportedException {
            return super.clone();
    }
}
