package homeWork1;

import java.util.Scanner;

//OK
public class CalculateRoots {
    public static void main(String[] args) {
        int numberA, numberB, numberC, discriminant;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lūdzu, ievadi pirmo skaitli");
        numberA = scanner.nextInt();
        System.out.println("Lūdzu, ievadi otro skaitli");
        numberB = scanner.nextInt();
        System.out.println("Lūdzu, ievadi trešo skaitli");
        numberC = scanner.nextInt();
        discriminant = calcDiscriminant(numberA, numberB, numberC);
        calculateRoots(numberA, numberB, discriminant);


    }

    private static void calculateRoots(int numberA, int numberB, int discriminant) {
        if (discriminant >= 0) {
            double firstRoot = (-numberB + Math.sqrt((double) discriminant)) / (2 * numberA);
            System.out.println(firstRoot);
            double secondRoot = (-numberB - Math.sqrt((double) discriminant)) / (2 * numberA);
            System.out.println(secondRoot);
        } else {
            System.out.println("Saknes nav");
        }
    }

    private static int calcDiscriminant(int numberA, int numberB, int numberC) {
        return (numberB * numberB) - (4 * numberA * numberC);
    }


}
