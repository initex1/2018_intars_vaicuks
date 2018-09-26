package homeWork10.ticTacToe;

public class HumanPlayer extends Player {


    private String name;
    private char playerChar;



    public HumanPlayer(String name) {
        this.name = name;
    }

    @Override
    public char getPlayerChar() {
        return playerChar;
    }

    public void setPlayerChar(char playerChar) {
        this.playerChar = playerChar;
    }


    @Override
    String getName() {
        return name;
    }

//    @Override
//    void setName(String input) {
//        name = input;
//    }


}
