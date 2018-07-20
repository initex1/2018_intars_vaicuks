package homeWork1;

import java.util.Scanner;

public class CalculateDiscriminant {
    public static void main(String[] args) {
        System.out.println("Ievadīto skaitļu diskriminants ir: " + calcDiscriminant());

    }

    private static int calcDiscriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lūdzu, ievadi pirmo skaitli");
        int numberA = scanner.nextInt();
        System.out.println("Lūdzu, ievadi otro skaitli");
        int numberB = scanner.nextInt();
        System.out.println("Lūdzu, ievadi trešo skaitli");
        int numberC = scanner.nextInt();
        return (numberB * numberB) - (4 * numberA * numberC);
    }
}
