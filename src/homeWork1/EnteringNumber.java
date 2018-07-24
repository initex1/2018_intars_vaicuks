package homeWork1;

import java.util.Scanner;

//OK, šeit varēja arī neiznest atsevišķā metodē
public class EnteringNumber {


    public static void main(String[] args) {
        System.out.println("Tu ievadīji skaitli: " + enterNumber());
    }

    private static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lūdzu, ievadi skaitli");
        int number = scanner.nextInt();
        return number;
    }


}
