package homeWork2;

import java.util.Scanner;

public class CompareThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salīdzināsim trīs ciparus. iedod man pirmio");
        int firstNumber = scanner.nextInt();
        System.out.println("OK. Iedod otru");
        int secondNumber = scanner.nextInt();
        System.out.println("OK. Nu tad trešo ar");
        int thirdNumber = scanner.nextInt();
        System.out.println("OK. Tagad salīdzināsim");
        compareNumbers(firstNumber, secondNumber, thirdNumber);
    }


    private static void compareNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber >= secondNumber && firstNumber > thirdNumber) {
            System.out.println(" Cipars " + firstNumber + " ir lielākais");
        } else if (firstNumber > secondNumber && firstNumber >= thirdNumber) {
            System.out.println(" Cipars " + firstNumber + " ir lielākais");
        } else if (secondNumber >= firstNumber && secondNumber > thirdNumber) {
            System.out.println(" Cipars " + secondNumber + " ir lielākais");
        } else if (thirdNumber >= secondNumber && thirdNumber > firstNumber) {
            System.out.println(" Cipars " + thirdNumber + " ir lielākais");
        } else if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("Visi ir vienādi");
        }
    }
}


