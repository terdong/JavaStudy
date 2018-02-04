package day16.protocol;

import java.io.Serializable;

public class Protocol implements Serializable {
    public static final long serialVersionUID = 1;

    private String nickName;
    private String message;

    public Protocol(String nickName) {
        this.nickName = nickName;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    @Override
    public String toString() {
        return nickName + ": " + message;
    }

}