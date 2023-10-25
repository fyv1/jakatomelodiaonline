package pl.fyv.jakatomelodiaonline.models;

public class GameStartMessage extends GameMessage {
    private String videoId;

    public GameStartMessage(String nickname, String videoId) {
        super(nickname);
        this.videoId = videoId;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    @Override
    public String toString() {
        return "GameStartMessage{" +
                "videoId='" + videoId + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
