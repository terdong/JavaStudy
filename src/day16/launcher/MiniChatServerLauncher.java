package day16.launcher;

import day16.server.MiniChatServer;

public class MiniChatServerLauncher {
    public static void main(String[] args) {
        System.out.println("미니채팅 서버 시작");

        MiniChatServer miniChatServer = new MiniChatServer(5000);
        miniChatServer.start();

        System.out.println("미니채팅 서버 종료");
    }
}
