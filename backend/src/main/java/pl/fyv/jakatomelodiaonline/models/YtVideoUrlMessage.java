package pl.fyv.jakatomelodiaonline.models;

public class YtVideoUrlMessage {
    private String nickname;
    private String videoId;

    public YtVideoUrlMessage(String nickname, String videoId) {
        this.nickname = nickname;
        this.videoId = videoId;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}
