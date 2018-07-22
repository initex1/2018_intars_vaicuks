package homeWork4;

import java.util.Scanner;

public class CountInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi pirmo ciparu: ");
        int numberA = scanner.nextInt();
        System.out.print("Ievadi otro ciparu: ");
        int numberB = scanner.nextInt();

        if (numberA < numberB) {
            while (numberA <= numberB) {
                System.out.println(numberA);
                numberA++;
            }
        }
    }

}
