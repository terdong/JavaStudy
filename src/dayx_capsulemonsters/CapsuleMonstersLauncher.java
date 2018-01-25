package dayx_capsulemonsters;

import dayx_capsulemonsters.managers.GameManager;
import dayx_capsulemonsters.player.Player;

/**
 * Created by DongHee Kim on 2018-01-22 022.
 */
public class CapsuleMonstersLauncher {
    public static void main(String[] args) {

        GameManager gameManager = new GameManager();
        gameManager.startGame();

    }
}
