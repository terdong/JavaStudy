package dayx_capsulemonsters.maps;

import dayx_capsulemonsters.player.Player;

import java.util.Random;

/**
 * Created by DongHee Kim on 2018-01-23 023.
 */
public class World {

    public static final int BLOCK_STATUS_LAND = 0; // 일반 땅
    public static final int BLOCK_STATUS_PLAYER = 1;
    public static final int BLOCK_STATUS_GOLD = 2; // 해당 위치로 이동시 1 ~ 5 골드 획득
    public static final int BLOCK_STATUS_MONSTER = 3;
    public static final int BLOCK_STATUS_BOSS = 4;
    public static final int BLOCK_STATUS_POTAL = 5;
    //private static final int BLOCK_STATUS_MUD= 1; // 밟으면 (다음 주사위 합 / 2)
    //private static final int BLOCK_STATUS_DICE = 2; // 밟으면 주사위 눈개수 3 ~ 8 사이로 변경
    private static final char [] BLOCK_DISPLAY_ARRAY = {'.','g','m','B','P','@'};

    private Random random;

    private int mapLength = 100;

    private int [] gameMap;

    private int previousMapData;
    private int playerPosition;

    public World(Random random){
        this.random = random;
    }

    public void initializeMap(){
        gameMap = new int[mapLength];

        for(int i=1; i<gameMap.length - 2; ++i){
            if(random.nextInt(4) == 0) {
                gameMap[i] = BLOCK_STATUS_GOLD;
            }else if(random.nextInt(3) == 0){
                gameMap[i] = BLOCK_STATUS_MONSTER;
            }
        }
        gameMap[0] = BLOCK_STATUS_PLAYER;
        gameMap[mapLength - 2] = BLOCK_STATUS_BOSS;
        gameMap[mapLength - 1] = BLOCK_STATUS_POTAL;

        playerPosition = 0;
        previousMapData = BLOCK_STATUS_LAND;
    }

    public int getEncounterNumber(){
        return previousMapData;
    }

    public boolean isEncounter(){
        return previousMapData > BLOCK_STATUS_LAND;
    }

    public void movePlayer(int moveCount){

        gameMap[playerPosition] = BLOCK_STATUS_LAND;
        playerPosition += moveCount;

        if(previousMapData != BLOCK_STATUS_BOSS &&  playerPosition > mapLength - 2){
            playerPosition = mapLength - 2;
        }else if(playerPosition > mapLength - 1){
            playerPosition = mapLength - 1;
        }

        previousMapData = gameMap[playerPosition];
        gameMap[playerPosition] = BLOCK_STATUS_PLAYER;
    }

    public void printMapInfo(){
        System.out.print("지도: ");
        int maxDistance = Math.min(playerPosition + 10, mapLength - 1);
        for(int i=Math.max(playerPosition - 10, 0); i<= maxDistance; ++i){
            System.out.printf("[%c]", BLOCK_DISPLAY_ARRAY[gameMap[i]]);
        }
        System.out.println();
    }
}
