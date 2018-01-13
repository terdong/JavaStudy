package _hoemwork.NewFish;

import java.util.Random;
import java.util.Scanner;

public class FishBreadTycoonLauncher {
    // 랜덤 객체는 static으로 선언 및 정의 해준다.
    public static Random random = new Random();


    // 고객이 처음 소지하고있는 금액을 설정해주는 정적메소드
    public static int InitialMoney() {
        return (random.nextInt(3) + 1) * 1000;
    }


    public static void main(String[] args) {

        System.out.println("붕어빵 타이쿤 게임을 시작합니다.");
        System.out.println("게임은 3명이서 할 수 있으며, 플레이어는 손님 1~3를 선택합니다.");
        System.out.println("손님을 모두 선택한 후에는 각 손님들이 1000~3000원을 받게 되며.");
        System.out.println("가진 돈만큼 손님이 붕어빵을 구매하게 됩니다.");
        System.out.println("손님들이 각 붕어빵 맛을 랜덤으로 평가하며 랜덤으로 가지게 된 돈과 랜덤으로 평가한");
        System.out.println("붕어빵의 평가치의 합이 가장 높은 사람이 승리하게 됩니다.");
        System.out.println("===================================동점이 나올 경우 앞선 손님이 승리하게 됩니다===================================");
        System.out.println("===================================그러므로 먼저 입력하는 사람이 유리합니다★★===================================");
        System.out.println("\n손님1부터 선택하여 주세요.\n");


        Scanner scanner = new Scanner(System.in);

///////////////////////////////////////////////////////////////
        String player_1 = "";
        System.out.print("손님 1을 선택할 분 : ");
        player_1 = scanner.nextLine();
        System.out.println(player_1 + "님께서 손님1을 선택하셨습니다.\n");

        String player_2 = "";
        System.out.println("손님2을 선택하여 주세요.\n");
        System.out.print("손님 2을 선택할 분 : ");
        player_2 = scanner.nextLine();
        System.out.println(player_2 + "님께서 손님2을 선택하셨습니다.\n");

        String player_3 = "";
        System.out.println("손님3을 선택하여 주세요.\n");
        System.out.print("손님 3을 선택할 분 : ");
        player_3 = scanner.nextLine();
        System.out.println(player_3 + "님께서 손님3을 선택하셨습니다.\n");

        FishBreadMachine fbm = new FishBreadMachine();
        FishBreadCEO ceo = new FishBreadCEO(fbm);


        Customer customer = new Customer(InitialMoney(), ceo);
        System.out.println(player_1 + "님이 주문합니다!");
        customer.orderFishBread();
        ceo.finalResult();
        int player_1score = ceo.totalMoney + 100 * ceo.totalTasty;

        customer = new Customer(InitialMoney(), ceo);
        System.out.println(player_2 + "님이 주문합니다!");
        customer.orderFishBread();
        ceo.finalResult();
        int player_2score = ceo.totalMoney + 100 * ceo.totalTasty;

        customer = new Customer(InitialMoney(), ceo);
        System.out.println(player_3 + "님이 주문합니다!");
        customer.orderFishBread();
        ceo.finalResult();
        int player_3score = ceo.totalMoney + 100 * ceo.totalTasty;

        if (player_1score >= player_2score && player_1score >= player_3score && player_2score >= player_3score) {
            System.out.println(player_1 + "님이 우승하셨습니다!\n" + player_2 + "님은 2등입니다\n" + player_3 + "님은 꼴등하셨습니다");
        } else if (player_1score >= player_2score && player_1score >= player_3score && player_3score >= player_2score) {
            System.out.println(player_1 + "님이 우승하셨습니다!\n" + player_3 + "님은 2등입니다\n" + player_2 + "님은 꼴등하셨습니다");
        } else if (player_2score >= player_1score && player_2score >= player_3score && player_1score >= player_3score) {
            System.out.println(player_2 + "님이 우승하셨습니다!\n" + player_1 + "님은 2등입니다\n" + player_3 + "님은 꼴등하셨습니다");
        } else if (player_2score >= player_1score && player_2score >= player_3score && player_3score >= player_1score) {
            System.out.println(player_2 + "님이 우승하셨습니다!\n" + player_3 + "님은 2등입니다\n" + player_1 + "님은 꼴등하셨습니다");
        } else if (player_3score >= player_1score && player_3score >= player_2score && player_1score >= player_2score) {
            System.out.println(player_3 + "님이 우승하셨습니다!\n" + player_1 + "님은 2등입니다\n" + player_2 + "님은 꼴등하셨습니다");
        } else if (player_3score >= player_1score && player_3score >= player_2score && player_2score >= player_1score) {
            System.out.println(player_3 + "님이 우승하셨습니다!\n" + player_2 + "님은 2등입니다\n" + player_1 + "님은 꼴등하셨습니다");

            System.out.println("붕어빵 타이쿤 게임을 종료합니다.");
        }
    }
}
