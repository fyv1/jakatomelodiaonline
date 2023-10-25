package pl.fyv.jakatomelodiaonline.models;

public class GameControlMessage extends GameMessage {
    private String operation;

    public GameControlMessage(String nickname, String operation) {
        super(nickname);
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "GameControlMessage{" +
                "operation='" + operation + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
