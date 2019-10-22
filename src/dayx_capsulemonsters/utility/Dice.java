package dayx_capsulemonsters.utility;

import java.util.Random;

/**
 * Created by DongHee Kim on 2018-01-22 022.
 */
public class Dice {
    private int diceNumber;
    private int diceRollingCount;

    public Dice(int diceNumber, int diceRollingCount) {
        this.diceNumber = diceNumber;
        this.diceRollingCount = diceRollingCount;
    }

    public int getDiceNumber() {
        return diceNumber;
    }

    public int getDiceRollingCount() {
        return diceRollingCount;
    }
}
