package pl.fyv.jakatomelodiaonline.models;

public class Message {
    private int seconds;

    public Message(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
