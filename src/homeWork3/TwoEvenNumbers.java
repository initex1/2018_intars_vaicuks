package homeWork3;

import java.util.Scanner;


public class TwoEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi pirmo ciparu: ");
        int numberA = scanner.nextInt();
        System.out.print("Ievadi otro ciparu: ");
        int numberB = scanner.nextInt();
        findEvenNumbers(numberA, numberB);
    }

    private static void findEvenNumbers(int numberA, int numberB) {
        if (numberA < numberB) {
            for (int a = numberA; a <= numberB; a++) {
                if (a % 2 == 0) {
                    System.out.println(a);
                }
            }
        }
    }
}
