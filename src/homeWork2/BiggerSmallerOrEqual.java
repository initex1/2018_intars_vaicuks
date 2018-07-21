package homeWork2;

import java.util.Scanner;

public class BiggerSmallerOrEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hais! Iedod man kādu ciparu");
        int numberToCompare = scanner.nextInt();
        analyzeNumber(numberToCompare);
    }

    private static void analyzeNumber(int numberToCompare) {
        if (numberToCompare < 0) {
            System.out.println("Skaitlis ir negstīvs");
        } else if (numberToCompare == 0) {
            System.out.println("Skaitlis ir nulle");
        } else {
            System.out.println("Skaitlis ir pozitīvs");
        }
    }
}
