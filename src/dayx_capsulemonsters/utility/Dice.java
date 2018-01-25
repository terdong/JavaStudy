package dayx_capsulemonsters.utility;

import java.util.Random;

/**
 * Created by DongHee Kim on 2018-01-22 022.
 */
public class Dice {
    private Random random;
    private int diceNumber = 6;

    public Dice(Random random) {
        this.random = random;
    }

    public void setDiceNumber(int number) {
        this.diceNumber = number;
    }

    public int rollDice() {
        return random.nextInt(diceNumber) + 1;
    }

    public int rollDice(int count) {
        return count > 1 ? rollDice() + rollDice(count - 1) : rollDice();
    }
}
