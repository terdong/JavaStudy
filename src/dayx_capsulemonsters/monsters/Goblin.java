package dayx_capsulemonsters.monsters;

import dayx_capsulemonsters.items.Item;
import dayx_capsulemonsters.skills.Skill;
import dayx_capsulemonsters.utility.Dice;

/**
 * Created by DongHee Kim on 2018-01-25 025.
 */
public class Goblin extends Monster{
    public Goblin(Item item) {
        super("고블린", 15, 2, 5, new Dice(4,2));
        this.reward = item;
    }
}
