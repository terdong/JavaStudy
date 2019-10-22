package dayx_capsulemonsters.managers;

import dayx_capsulemonsters.maps.World;
import dayx_capsulemonsters.monsters.Monster;
import dayx_capsulemonsters.player.Player;
import dayx_capsulemonsters.skills.Skill;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import static dayx_capsulemonsters.utility.Messages.*;

/**
 * Created by DongHee Kim on 2018-01-23 023.
 */
public class GameManager {

    private Player player;
    private HashMap<String, Skill> skillHashMap;
    private World world;
    private DiceManager diceManager;
    private MonsterManager monsterManager;
    private ItemManager itemManager;
    private Random random;

    private int currentPlayerPositionIndex = 0;
    private boolean isPlay = true;

    private Scanner scanner = new Scanner(System.in);

    public GameManager() {

        random = new Random();
        diceManager = new DiceManager(random);
        itemManager = new ItemManager(random);
        monsterManager = new MonsterManager(random, itemManager);
        world = new World(random);

        initialize();

    }

    private void initialize() {
/*        if( skillHashMap == null){
            monsterHashMap = new HashMap<>();
        }*/

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

        System.out.println();
        world.printMapInfo();

        System.out.println(GAME_PLAY_MENU);
        checkCommand(getCommandNumber());

        if(world.isEncounter()){
            switch (world.getEncounterNumber()){
                case 2:
                    int increaseGold = random.nextInt(5) + 1;
                    player.increaseGold(increaseGold);
                    System.out.printf("골드를 +%d 만큼 획득 했습니다. (현재 총 %d골드 소지)\n", increaseGold, player.getGold());
                    break;
                case 3:
                    battleMonster();
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }

    }

    private int getCommandNumber(){
        System.out.print(INPUT);
        int commandNumber = scanner.nextInt();
        System.out.println();
        return commandNumber;
    }

    private void battleMonster(){

        Monster monster = null;
        try {
            monster = monsterManager.getRandomMonster();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("몬스터 생성에 문제가 생겨 스킵합니다.");
            return;
        }
        System.out.printf("%s이(가) 나타났다!. 잔뜩 화가난 %s은(는) 무작정 당신에게 달려듭니다.\n",monster.getName(), monster.getName());
        System.out.println("전투를 시작합니다.");
        boolean isBattle = true;
        String monsterName = monster.getName();
        for(;isBattle;) {
            System.out.println();

            // 플레이어 정보
            player.printUnitInfo();
            // 몬스터 정보
            monster.printUnitInfo();

            // 플레이어 패배 체크
            if(player.isDead()){
                isPlay = false;
                isBattle = false;
                System.out.println();
                System.out.println("몬스터와의 전투에서 패배했습니다.");
                System.out.println("마계로 떨어진 플레이어는 결국 탈출을 못하고 이곳에서 생을 마감했습니다.");
                System.out.println("################################## GAME OVER ########################################");
                System.out.println("#####################################################################################");
            }
            // 몬스터 패배 체크
            else if(monster.isDead()){
                isBattle = false;
                System.out.println();
                System.out.println("몬스터와의 전투에서 승리했습니다.");
                System.out.println("#####################################################################################");

                // 전리품 획득


            }

            System.out.println();

            if(isBattle) {
                // 플레이어 턴
                System.out.println("#####################################################################################");
                System.out.println("# [플레이어 턴] 전투메뉴: 1. 공격, 2. 크리티컬 공격(실패 확률 60%)");
                int commandNumber = getCommandNumber();

                int damage = 0;
                switch (commandNumber) {
                    case 1:
                        damage = diceManager.rollDice(player.getDiceForBattle());
                        System.out.printf("# %s에게 %d 만큼의 피해를 주었습니다.\n", monsterName, damage);
                        monster.getDamage(damage);
                        break;
                    case 2:
                        if(random.nextInt(10) < 4){
                            damage = diceManager.rollDice(player.getDiceForBattle()) * 2;
                            System.out.printf("# %s에게 %d 만큼의 크리티컬 피해를 주었습니다.\n", monsterName, damage);
                            monster.getDamage(damage);
                        }else
                        {
                            System.out.println("크리티컬 공격에 실패 했습니다.");
                        }
                        break;
                }
                System.out.println("#####################################################################################");


                // 몬스터 턴
                System.out.println();
                System.out.println("#####################################################################################");
                System.out.println("# [몬스터 턴] ");
                damage = diceManager.rollDice(monster.getDiceForBattle());
                System.out.printf("# %s은(는) 플레이어에게 %d 만큼의 피해를 주었습니다.\n", monsterName, damage);
                player.getDamage(damage);
                System.out.println("#####################################################################################");
            }
        }
    }

    private void checkCommand(int commandNumber) {
        // 1. 이동, 2. 보유 몬스터 정보, 3. 플레이어 정보, 4. 상점, 5. 도움말, 6. 게임 종료
        switch (commandNumber) {
            case 1:
                int moveCount = diceManager.rollDice(player.getDiceForMove());
                System.out.printf("이동하기 위해 주사위를 굴립니다. %d이 나왔습니다.\n%d칸 이동합니다.\n", moveCount, moveCount);
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
