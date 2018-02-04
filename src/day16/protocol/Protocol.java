package day16.protocol;

import java.io.Serializable;

public class Protocol implements Serializable {
    public static final long serialVersionUID = 1;

    private String nickName;
    private String message;
    private boolean isDisconnect;

    public Protocol(String nickName) {
        this.nickName = nickName;
        this.isDisconnect = false;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public String getName(){
        return nickName;
    }

    public boolean isEmptyMessage(){
        return message == null || message.isEmpty();
    }

    @Override
    public String toString() {
        return nickName + ": " + message;
    }

    public boolean isDisconnect() {
        return isDisconnect;
    }

    public void setDisconnect(boolean isDisconnect) {
        this.isDisconnect = isDisconnect;
    }
}