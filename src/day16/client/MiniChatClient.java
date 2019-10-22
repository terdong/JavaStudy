package day16.client;

import day16.protocol.Protocol;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class MiniChatClient {

    private Scanner scanner;
    private Socket socket;

    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;

    private boolean isPlay;

    private Protocol clientProtocol;

    public MiniChatClient() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.print("채팅에 사용할 닉네임을 정해주세요.\n입력: ");
//        clientProtocol = new Protocol(scanner.nextLine());
        clientProtocol = new Protocol("동희");

        try {
            createSocket();

            System.out.println("서버 접속에 성공했습니다.");

            openStream();

            isPlay = true;
            for (; isPlay; ) {
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

        boolean isEmptyMessage = true;
        for (; isEmptyMessage; ) {
            System.out.print("메세지 입력: ");
            String message = scanner.nextLine();
            clientProtocol.setMessage(message);

            isEmptyMessage = clientProtocol.isEmptyMessage();

            if(isEmptyMessage) {
                System.out.println("* 메시지를 입력해주세요.");
            }
        }

        writeObject(clientProtocol);

    }

    private void receive() throws IOException, ClassNotFoundException {
        Object object = inputStream.readObject();
        if (object != null) {
            Protocol protocol = (Protocol) object;
            System.out.println(protocol);

            isPlay = !protocol.isDisconnect();
        }
    }

    /**
     * outputStream과 inputStream 객체를 연속으로 생성해 줄 경우 왠지 모르게 교착상태(모르면 검색해보세요)에 빠진다.
     * 그래서 outputStream 객체 생성 후 writeObject 메소드를 사용해서 데이터 전송을 한번 한 후 inputStream 객체를 생성한다.
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private void openStream() throws IOException, ClassNotFoundException {
        outputStream = new ObjectOutputStream(new BufferedOutputStream(socket.getOutputStream()));
        writeObject(clientProtocol);

        inputStream = new ObjectInputStream(socket.getInputStream());
        receive();

    }

    private void closeStream() throws IOException {
        outputStream.close();
        inputStream.close();
    }

    private void writeObject(Protocol protocol) throws IOException {
        outputStream.writeObject(protocol);
        outputStream.reset();
        outputStream.flush();
    }

}
