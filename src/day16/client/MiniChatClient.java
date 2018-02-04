package day16.client;

import day16.protocol.Protocol;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MiniChatClient {

    private Scanner scanner;
    private Socket socket;

    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;

    private boolean isPlay;

    private Protocol protocol;

    public MiniChatClient() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.print("채팅에 사용할 닉네임을 정해주세요.\n입력: ");
        protocol = new Protocol("동희");

        try {
            createSocket();
            System.out.println("서버 접속에 성공했습니다.");

            openStream();

            isPlay = true;
            for(;isPlay;) {
                sendMessage();
                receive();

            }
            closeStream();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void createSocket() throws IOException {
        // 192.168.0.214
        socket = new Socket("127.0.0.1", 5000);
    }

    private void sendMessage() throws IOException {

        System.out.print("메세지 입력: ");
        String message = scanner.nextLine();
        Protocol protocol = new Protocol("동희");
        protocol.setMessage(message);


        outputStream.writeObject(protocol);
        outputStream.reset();
        outputStream.flush();

        if(message.equals("/exit") || message.equals("/quit") || message.equals("/종료")){
            isPlay = false;
        }
    }

    private void receive() throws IOException, ClassNotFoundException {
        inputStream = new ObjectInputStream(socket.getInputStream());
        Object object = inputStream.readObject();
        if (object != null) {
            Protocol protocol = (Protocol)object;
            System.out.println(protocol);
        }
        inputStream.close();

    }

    private void openStream() throws IOException {
        outputStream = new ObjectOutputStream(new BufferedOutputStream(socket.getOutputStream()));

    }

    private void closeStream() throws IOException {
        outputStream.close();
        inputStream.close();
    }

}
