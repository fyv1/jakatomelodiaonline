package pl.fyv.jakatomelodiaonline.models;

public class GameMessage {
    String nickname;

    public GameMessage(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
