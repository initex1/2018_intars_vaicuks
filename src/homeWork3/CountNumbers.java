package homeWork3;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi pirmo ciparu: ");
        int numberA = scanner.nextInt();
        System.out.print("Ievadi otro ciparu: ");
        int numberB = scanner.nextInt();

        resultMethodA(numberA, numberB);
        resultMethodB(numberA, numberB);

    }

    private static void resultMethodA(int numberA, int numberB) {
        int result = 0;
        if (numberA < numberB) {
            for (int a = numberA; a <= numberB; a++) {
                result = result + a;
            }
            System.out.println("Visu skaitļu summa ar pirmo metori: " + result);
        }
    }

    private static void resultMethodB(int numberA, int numberB) {
        if (numberA < numberB) {
            int resultB = (numberB - numberA + 1) * (numberA + numberB) / 2;
            System.out.println("Visu skaitļu summa ar otro metori: " + resultB);
        }
    }
}

