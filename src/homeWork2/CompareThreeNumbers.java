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
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Pirmais cipars " + firstNumber + " ir lielāks par " + secondNumber + " un " + thirdNumber);
        } else if (firstNumber > secondNumber && firstNumber < thirdNumber) {
            System.out.println("Trešai cipars " + thirdNumber + " ir lielāks par " + firstNumber + " un " + secondNumber);
        } else if ((firstNumber < secondNumber && secondNumber > thirdNumber)) {
            System.out.println("Otrais cipars " + secondNumber + " ir lielāks par " + firstNumber + " un " + thirdNumber);
        }else if ((firstNumber < secondNumber && secondNumber < thirdNumber)) {
            System.out.println("Threšai cipars " + thirdNumber + " ir lielāks par " + firstNumber + " un " + secondNumber);
        }else{
            System.out.println("Visi ir vienādi");
        }
    }
}
