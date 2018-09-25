package homeWork10.ticTacToe;

public class ComputerPlayer extends Player {

    public String name;
    public  char computerChar;

    public ComputerPlayer(String name) {
        this.name = name;
        this.computerChar='O';
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    char getPlayerChar() {
        return computerChar;
    }

//    @Override
//    void setName(String name) {
//    }

}
