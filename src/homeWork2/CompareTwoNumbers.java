package homeWork2;

import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sveiks! Salīdzināsim divus ciparus. Iedod man pirmo ciparu");
        int numberA = scanner.nextInt();
        System.out.println("OK. Iedod otru ar");
        int numberB = scanner.nextInt();
        compareNumbers(numberA, numberB);

    }

    private static void compareNumbers(int numberA, int numberB) {
        if (numberA > numberB) {
            System.out.println("Šis cipars " + numberA + " ir lilāks par " + numberB); //typo - lilāks
        } else if (numberA < numberB) {
            System.out.println("Šis cipars " + numberB + " ir lilāks par " + numberA); //typo - lilāks
        } else {
            System.out.println("ŠAbi ir vienādi: A==B");
        }
    }
}
