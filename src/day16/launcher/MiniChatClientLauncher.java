package day16.launcher;

import day16.client.MiniChatClient;

public class MiniChatClientLauncher {
    public static void main(String[] args) {
        System.out.println("미니채팅 클라이언트 시작");

        MiniChatClient miniChatClient = new MiniChatClient();
        miniChatClient.start();

        System.out.println("미니채팅 클라이언트 종료");

    }
}
