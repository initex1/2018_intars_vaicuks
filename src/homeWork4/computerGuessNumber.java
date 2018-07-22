package homeWork4;

import java.util.Random;
import java.util.Scanner;

public class computerGuessNumber {
    public static void main(String[] args) {
        System.out.println("Sveix! Iedomājies ciparu no 0 līdz 100");
        System.out.println("Es tagad arī izdomāšu ciparu un Tu pateiksi vai tas ir vienāds ar Tavējo ");

        /* Izvēlies izmantojamo minēšanas metrodi!!!*/
        //randomGuess();
        binaryGuess();
    }

    private static void binaryGuess() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ja mans cipars ir lielāks, tad ieraksti" + " \"b\"");
        System.out.println("Ja mans cipars ir mazāks, tad ieraksti" + " \"s\"");
        System.out.println("Ja mans cipars ir vienāds, tad ieraksti" + " \"ok\"");

        int myGuess = random.nextInt(101);
        int rangeFrom = 0;
        int rangeTo = 100;

        System.out.println("Es izvēlējos ciparu " + myGuess);
        System.out.print("Vai tas ir vienāds/lielāks/mazāks attiecībā pret Tavu?");
        String answer = scanner.next();
        while (!answer.equals("ok")) {
            if (answer.equals("s")) {
                rangeFrom = myGuess+1;
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
        System.out.println("Es ir faķīrs!!!");
    }

    private static void randomGuess() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ja mans cipars ir vienāds, tad ieraksti" + " \"ok\"");

        int myGuess = random.nextInt(101);

        System.out.println("Es izvēlējos ciparu " + myGuess);
        System.out.print("Vai tas ir vienāds ar Tavu?");
        String answer = scanner.next();
        while (!answer.equals("ok")) {
            System.out.println("Mēģināšu vēlreiz");
            myGuess = random.nextInt(101);
            System.out.println("Es izvēlējos ciparu " + myGuess);
            System.out.print("Vai tas ir vienāds ar Tavu?");
            answer = scanner.next();
        }
    }
}
