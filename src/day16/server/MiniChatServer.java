package day16.server;

import day16.protocol.Protocol;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MiniChatServer {

    private int port;

    private ServerSocket serverSocket;
    private Socket clientSocket;

    private boolean isWork;
    private boolean isConnecting;

    private ObjectInputStream inputStream;
    private ObjectOutputStream outputStream;

    private Protocol clientProtocol;
    private Protocol serverProtocol;

    public MiniChatServer(int port) {
        this.port = port;
        this.isWork = true;
        this.serverProtocol = new Protocol("메롱이");
    }

    public void start() {

        try {
            createServerSocket(port);

            for (; isWork; ) {
                System.out.println("클라이언트 접속을 기다리는 중입니다.");
                accept();
                openStream();

                isConnecting = true;
                for(;isConnecting;) {
                    receive();
                    sendClient();
                }

                closeStream();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void createServerSocket(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    private void accept() throws IOException {
        clientSocket = serverSocket.accept();
        System.out.println("클라이언트가 접속 했습니다. client ip address = " + clientSocket.getRemoteSocketAddress().toString());
    }

    private void receive() throws IOException, ClassNotFoundException {
        System.out.println("클라이언트로 부터 받을 데이터를 기다리는 중입니다.");
        Object object = inputStream.readObject();
        if(object != null) {
            clientProtocol = (Protocol) object;
            System.out.println(clientProtocol);
        }
    }

    private void sendClient() throws IOException {
        String message = clientProtocol.getMessage();
        if(message.equals("/exit") || message.equals("/quit") || message.equals("/종료")){
            isConnecting = false;
            serverProtocol.setMessage("그동안 즐거웠어. 이 말들은 내 본심이 아니야. 미안 ㅃㅃ");
        }else{
            serverProtocol.setMessage(getReply(message));
        }

        outputStream.writeObject(serverProtocol);
        outputStream.reset();
        outputStream.flush();
    }

    private void openStream() throws IOException {
        inputStream = new ObjectInputStream(clientSocket.getInputStream());
        outputStream = new ObjectOutputStream(new BufferedOutputStream(clientSocket.getOutputStream()));

    }
    private void closeStream() throws IOException {
        inputStream.close();
        outputStream.close();
    }

    private String getReply(String clientMessage){
        String reply = "아 몰라 몰라. 못 알아 듣겠쏘.... ";
        if(clientMessage.contains("안녕")){
            reply = "그래 안녕? 너 뭐 하는 놈이야?";
        }else if(clientMessage.contains("뭐해")){
            reply = "니가 알아서 뭐하게?";
        }else if(clientMessage.contains("몇살") || clientMessage.contains("나이")){
            reply = "먹을만큼 먹었다. 왜?";
        }
        return reply;
    }
}
