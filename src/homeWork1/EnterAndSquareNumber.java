package homeWork1;

import java.util.Scanner;

public class EnterAndSquareNumber {
    public static void main(String[] args) {
        System.out.println("ievadītais skaitlis kvadrātā ir: " + sqareNumber());
    }

    private static int sqareNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lūdzu, ievadi skaitli");
        int number = scanner.nextInt();
        return number * number;
    }
}
