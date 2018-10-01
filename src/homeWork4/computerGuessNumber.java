package homeWork4;

import java.util.Random;
import java.util.Scanner;

//class should start with capital letter
public class computerGuessNumber {
    public static void main(String[] args) {
        System.out.println("Sveix! Iedomājies ciparu no 0 līdz 100");
        System.out.println("Es tagad arī izdomāšu ciparu un Tu pateiksi vai tas ir vienāds ar Tavējo ");

        //avoid comments in your code, code methods names should be explenatory
        /* Izvēlies izmantojamo minēšanas metrodi!!!*/
        //randomGuess();
        binaryGuess();
    }

    private static void binaryGuess() {
        Random random = new Random(); //no need for local variable, since it's used only once
        Scanner scanner = new Scanner(System.in); //define local variable near the place it will be used
        System.out.println("Ja mans cipars ir lielāks, tad ieraksti" + " \"b\"");
        System.out.println("Ja mans cipars ir mazāks, tad ieraksti" + " \"s\"");
        System.out.println("Ja mans cipars ir vienāds, tad ieraksti" + " \"ok\"");

        int myGuess = random.nextInt(101);
        //these should be constants
        int rangeFrom = 0;
        int rangeTo = 100;

        System.out.println("Es izvēlējos ciparu " + myGuess);
        System.out.print("Vai tas ir vienāds/lielāks/mazāks attiecībā pret Tavu?");
        //no need for "answer" local variable
        String answer = scanner.next();
        binaryGuessLogic(scanner, myGuess, rangeFrom, rangeTo, answer);
        System.out.println("Es ir faķīrs!!!");
    }

    private static void binaryGuessLogic(Scanner scanner, int myGuess, int rangeFrom, int rangeTo, String answer) {
   //again should be constants - ok, s, b etc
        while (!answer.equals("ok")) {
            if (answer.equals("s")) {
                //use compact form rangeFrom += myGuess
                rangeFrom = myGuess+1;
                //these lines repeats them self
                //could be moved to separate method like with already calculated "myGuess"
                System.out.println("range from " + rangeFrom + " līdz " + rangeTo);
                System.out.println("Mēģināšu vēlreiz");
                //myGuess = random.nextInt(rangeTo - rangeFrom + 1) + rangeFrom;
                myGuess=((rangeTo-rangeFrom)/2)+rangeFrom;
                System.out.println("Es sss  izvēlējos ciparu " + myGuess);
            }
            if (answer.equals("b")) {
                rangeTo = myGuess-1;
                System.out.println("range from " + rangeFrom + " līdz " + rangeTo);
                System.out.println("Mēģināšu vēlreiz");
                //myGuess = random.nextInt(rangeTo - rangeFrom + 1) + rangeFrom;
                myGuess=((rangeTo-rangeFrom)/2)+rangeFrom;
                System.out.println("Es bbbizvēlējos ciparu " + myGuess);
            }
            System.out.print("Vai tas ir vienāds/lielāks/mazāks attiecībā pret Tavu?");
            answer = scanner.next();
        }
    }

    private static void randomGuess() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        // no need for "+" in next line
        System.out.println("Ja mans cipars ir vienāds, tad ieraksti" + " \"ok\"");

        //constant 101, and it repeats, so there should be method - myGuess
        int myGuess = random.nextInt(101);

        System.out.println("Es izvēlējos ciparu " + myGuess);
        System.out.print("Vai tas ir vienāds ar Tavu?");
        String answer = scanner.next();
        randomGuessLogic(random, scanner, answer);
    }

    private static void randomGuessLogic(Random random, Scanner scanner, String answer) {
        //no need for this variable at this level
        int myGuess;
        while (!answer.equals("ok")) {
            System.out.println("Mēģināšu vēlreiz");
            myGuess = random.nextInt(101);
            System.out.println("Es izvēlējos ciparu " + myGuess);
            System.out.print("Vai tas ir vienāds ar Tavu?");
            answer = scanner.next();
        }
    }
}
