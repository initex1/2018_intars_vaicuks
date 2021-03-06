package homeWork10.ticTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class playGame {
    public static void main(String[] args) {

        makeGreeting();
        Scanner scanner = new Scanner(System.in);
        //Create game
        Game game = getGame(scanner);
        System.out.println("Please, enter Player1 name");
        HumanPlayer player1 = getHumanPlayer(scanner);
        player1.setPlayerChar('X');
        switch (game.getGameMode()) {
            case MODE1:
                System.out.println("Please, enter Player2 name");
                HumanPlayer player2 = getHumanPlayer(scanner);
                player2.setPlayerChar('O');
                //do game MODE1 here;
                System.out.println("Let's the battle begin! ");
                playGameMode1(game, player1, player2, scanner);
                break;
            case MODE2:
                ComputerPlayer computerPlayer = new ComputerPlayer("Computer");
                //do game MODE2 here;
                System.out.println("Ho-hoo! I will crush you! ");
                playGameMode2(scanner, game, player1, computerPlayer);
                break;
        }
    }

    private static void playGameMode2(Scanner scanner, Game game, HumanPlayer player1, ComputerPlayer computerPlayer) {
        Player currentPlayer = player1;
        System.out.println(currentPlayer.getName() + " - your move! Make your selection by pressing buttons from 1-9!");
        game.getLayout().printLayout();
        boolean isWinner = false;
        do {
            if (isMovesLeft(game)) {
                if (currentPlayer.getName() != "Computer") {
                    getHumanInput(game, scanner, currentPlayer);
                } else {
                    getComputerInput(game, computerPlayer);
                }
                isWinner = checkForWinner(game);
                if (!isMovesLeft(game)) {
                    if (isWinner == true) {
                        System.out.println(currentPlayer.getName() + " is WINNER");
                        break;
                    } else {
                        System.out.println("Doh - out of moves!");
                        break;
                    }
                }
                if (isWinner == true) {
                    System.out.println(currentPlayer.getName() + " is WINNER");
                    break;
                }
                currentPlayer = changeCurrentPlayer(game, player1, computerPlayer, currentPlayer);

            }
        } while (!isWinner);
    }

    private static void getComputerInput(Game game, Player player) {
        System.out.println("****************************");
        List<Integer> availableList =  new ArrayList();
        for (int i=0;i<game.getLayout().gameLayout.length;i++){
         if(game.getLayout().gameLayout[i]=='\u0000'){
             availableList.add(i);
         }
     }
        Random random=new Random();
        int moveIndex=random.nextInt(availableList.size()-1);
        int moveValue=availableList.get(moveIndex);

        game.getLayout().gameLayout[moveValue] = player.getPlayerChar();
        game.getLayout().printLayout();
        System.out.println("I'm genious!");
        System.out.println("****************************");
        System.out.println();

    }

    private static Player changeCurrentPlayer(Game game, HumanPlayer player1, ComputerPlayer computerPlayer, Player currentPlayer) {
        if (currentPlayer == player1) {
            currentPlayer = computerPlayer;
            System.out.println("OK. Now it's my turn!");
            game.getLayout().printLayout();
        } else {
            currentPlayer = player1;
            System.out.println("OK. Now it's " + currentPlayer.getName() + " turn!");
            game.getLayout().printLayout();
        }
        return currentPlayer;
    }

    private static void playGameMode1(Game game, HumanPlayer player1, HumanPlayer player2, Scanner scanner) {
        HumanPlayer currentPlayer = player1;
        System.out.println(currentPlayer.getName() + " - your move! Make your selection by pressing buttons from 1-9!");
        game.getLayout().printLayout();
        boolean isWinner = false;
        do {
            if (isMovesLeft(game)) {
                getHumanInput(game, scanner, currentPlayer);
                isWinner = checkForWinner(game);
                if (!isMovesLeft(game)) {
                    if (isWinner == true) {
                        System.out.println(currentPlayer.getName() + " is WINNER");
                        break;
                    } else {
                        System.out.println("Doh - out of moves!");
                        break;
                    }
                }
                if (isWinner == true) {
                    System.out.println(currentPlayer.getName() + " is WINNER");
                    break;
                }
                currentPlayer = changeHumanPlayer(game, player1, player2, currentPlayer);
            }
        } while (!isWinner);

    }

    private static HumanPlayer changeHumanPlayer(Game game, HumanPlayer player1, HumanPlayer player2, HumanPlayer currentPlayer) {
        if (currentPlayer == player1) {
            currentPlayer = player2;
            System.out.println("OK. Now it's " + currentPlayer.getName() + " turn!");
            game.getLayout().printLayout();
        } else {
            currentPlayer = player1;
            System.out.println("OK. Now it's " + currentPlayer.getName() + " turn!");
            game.getLayout().printLayout();
        }
        return currentPlayer;
    }

    private static boolean isMovesLeft(Game game) {
        for (char c : game.getLayout().gameLayout) {
            if (c == '\u0000') {
                return true;
            }
        }
        return false;
    }

    private static void getHumanInput(Game game, Scanner scanner, Player player) {
        int humanInput;
        System.out.println("=================================");
        humanInput = getValidHumanInputType(scanner);
        if (humanInput >= 1 && humanInput <= 9 && game.getLayout().gameLayout[humanInput - 1] == '\u0000') {
            game.getLayout().gameLayout[humanInput - 1] = player.getPlayerChar();
            game.getLayout().printLayout();
            System.out.println("Nice move,  " + player.getName() + "!");
            System.out.println("****************************");
            System.out.println();
        } else {
            System.out.println("Invalid selection - already used field or wrong number. Try again!");
            getHumanInput(game, scanner, player);
        }

    }

    private static int getValidHumanInputType(Scanner scanner) {
        int humanInput;
        while (!scanner.hasNextInt()) {
            System.out.println("That's not a number!");
            scanner.next();
        }
        humanInput = scanner.nextInt();
        return humanInput;
    }

    private static boolean checkForWinner(Game game) {
        //Sorry for this
        if (game.getLayout().gameLayout[0] != '\u0000' && game.getLayout().gameLayout[0] == game.getLayout().gameLayout[1] && game.getLayout().gameLayout[0] == game.getLayout().gameLayout[2]) {
            return true;
        } else if (game.getLayout().gameLayout[3] != '\u0000' && game.getLayout().gameLayout[3] == game.getLayout().gameLayout[4] && game.getLayout().gameLayout[3] == game.getLayout().gameLayout[5]) {
            return true;
        } else if (game.getLayout().gameLayout[6] != '\u0000' && game.getLayout().gameLayout[6] == game.getLayout().gameLayout[7] && game.getLayout().gameLayout[6] == game.getLayout().gameLayout[8]) {
            return true;
        } else if (game.getLayout().gameLayout[0] != '\u0000' && game.getLayout().gameLayout[0] == game.getLayout().gameLayout[3] && game.getLayout().gameLayout[0] == game.getLayout().gameLayout[6]) {
            return true;
        } else if (game.getLayout().gameLayout[1] != '\u0000' && game.getLayout().gameLayout[1] == game.getLayout().gameLayout[4] && game.getLayout().gameLayout[1] == game.getLayout().gameLayout[7]) {
            return true;
        } else if (game.getLayout().gameLayout[2] != '\u0000' && game.getLayout().gameLayout[2] == game.getLayout().gameLayout[5] && game.getLayout().gameLayout[2] == game.getLayout().gameLayout[8]) {
            return true;
        } else if (game.getLayout().gameLayout[0] != '\u0000' && game.getLayout().gameLayout[0] == game.getLayout().gameLayout[4] && game.getLayout().gameLayout[0] == game.getLayout().gameLayout[8]) {
            return true;
        } else if (game.getLayout().gameLayout[2] != '\u0000' && game.getLayout().gameLayout[2] == game.getLayout().gameLayout[4] && game.getLayout().gameLayout[2] == game.getLayout().gameLayout[6]) {
            return true;
        }
        return false;
    }

    private static HumanPlayer getHumanPlayer(Scanner scanner) {
        String name = null;
        while (name == null) {
            name = scanner.next();
        }
        return new HumanPlayer(name);
    }


    private static void makeGreeting() {
        System.out.println("Hi! This is Tic-Tac-Toe game! Please, select game mode");
        System.out.println("1-Human vs Human");
        System.out.println("2-Human vs Computer");
    }

    private static Game getGame(Scanner scanner) {
        GameMode gameMode;
        int selection = 0;
        while (selection != 1 && selection != 2) {
            System.out.println("Please, make valid selection!");
            selection = scanner.nextInt();
        }
        if (selection == 1) {
            gameMode = GameMode.MODE1;
        } else {
            gameMode = GameMode.MODE2;
        }
        return new Game(gameMode);
    }
}
