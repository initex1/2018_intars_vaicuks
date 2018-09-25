package homeWork10.ticTacToe;

public class Game {

    private GameMode gameMode;
    private FieldLayout fieldLayout;


    public Game(GameMode gameMode) {
        this.gameMode = gameMode;
        fieldLayout = new FieldLayout();
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public FieldLayout getLayout() {
        return fieldLayout;
    }
}
