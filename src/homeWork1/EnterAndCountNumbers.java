package homeWork1;

import java.util.Scanner;

//OK, šeit tāpat nav vajadzīga atsevišķa metode
public class EnterAndCountNumbers {
    public static void main(String[] args) {
        System.out.println("Abu skaitļu summa ir " + processNumbers());
    }

    private static int processNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lūdzu, ievadi pirmo skaitli");
        int firstNumber = scanner.nextInt();
        System.out.println("Lūdzu, ievadi otro skaitli");
        int secondNumber = scanner.nextInt();
        return firstNumber + secondNumber;
    }
}
