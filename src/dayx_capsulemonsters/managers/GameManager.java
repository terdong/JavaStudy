package dayx_capsulemonsters.managers;

import dayx_capsulemonsters.maps.World;
import dayx_capsulemonsters.monsters.Monster;
import dayx_capsulemonsters.player.Player;
import dayx_capsulemonsters.skills.Skill;
import dayx_capsulemonsters.utility.Dice;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import static dayx_capsulemonsters.utility.Messages.*;

/**
 * Created by DongHee Kim on 2018-01-23 023.
 */
public class GameManager {

    private Player player;
    private HashMap<String, Monster> monsterHashMap;
    private HashMap<String, Skill> skillHashMap;
    private World world;
    private Dice dice;
    private Random random;

    private int currentPlayerPositionIndex = 0;
    private boolean isPlay = true;

    private Scanner scanner = new Scanner(System.in);

    public GameManager() {

        random = new Random();
        dice = new Dice(random);
        world = new World(random);

        initialize();

    }

    private void initialize() {
        if(monsterHashMap == null){
            monsterHashMap = new HashMap<>();
        }
        if( skillHashMap == null){
            monsterHashMap = new HashMap<>();
        }

        world.initializeMap();

    }

    public void startGame() {
        intro();
        for (; isPlay; ) {

            play();

        }
    }

    private void intro() {
        System.out.println(INTRO_00);
        System.out.println(INTRO_01);
        System.out.print(INTRO_02);

//        String playerName = scanner.next();
        String playerName = "동희";
        System.out.printf(INTRO_03, playerName);
        player = new Player(playerName);

        System.out.println(INTRO_04);
        System.out.println(INTRO_05);
        System.out.println(INTRO_06);
        System.out.println(INTRO_07);
        System.out.println(INTRO_08);
        System.out.println(LINE_SEPARATOR);
    }

    private void play() {

        if(world.isEncounter()){
            switch (world.getEncounterNumber()){
                case 2:
                    int increaseGold = random.nextInt(5) + 1;
                    player.increaseGold(increaseGold);
                    System.out.printf("골드를 +%d 만큼 획득 했습니다. (현재 총 %d골드 소지)\n", increaseGold, player.getGold());
                    break;
                case 3:
                    System.out.println("몬스터와 조우했습니다. 화난 몬스터는 무작정 당신에게 달려듭니다.");
                    System.out.println("전투 시작!");

                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }

        System.out.println();
        world.printMapInfo();

        System.out.println(GAME_PLAY_MENU);
        System.out.print(INPUT);
        int commandNumber = scanner.nextInt();
        System.out.println();
        checkCommand(commandNumber);

    }

    private void checkCommand(int commandNumber) {
        // 1. 이동, 2. 보유 몬스터 정보, 3. 플레이어 정보, 4. 상점, 5. 도움말, 6. 게임 종료
        switch (commandNumber) {
            case 1:
                System.out.println("이동하기 위해 주사위를 굴립니다.");
                int moveCount = dice.rollDice();
                System.out.printf("%d칸 이동합니다.\n", moveCount);
                world.movePlayer(moveCount);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("도움말: .= 빈 땅, P=플레이어, m=몬스터, g=골드, B=보스, @=목적지");
                break;
            default:
                System.out.println("게임을 끝냅니다.");
                isPlay = false;
                break;
        }
    }
}
