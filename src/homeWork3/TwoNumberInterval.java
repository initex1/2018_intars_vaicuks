package homeWork3;

import java.util.Scanner;


public class TwoNumberInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi pirmo ciparu: ");
        int numberA = scanner.nextInt();
        System.out.print("Ievadi otro ciparu: ");
        int numberB = scanner.nextInt();
        printIntervalNumbers(numberA, numberB);
    }

    private static void printIntervalNumbers(int numberA, int numberB) {
        if (numberA < numberB) {
            System.out.println("Pirmais cipars ir mazāks par otro, tāpēc: ");
            for (int a = numberA; a <= numberB; a++) {
                System.out.println(a);
            }
        }
    }
}
