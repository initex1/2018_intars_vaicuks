package homeWork10.calculator;

import java.util.Scanner;

public class PlayWithCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, let's play with calculator");
        System.out.println("Give me first double");
        double a = scanner.nextDouble();
        System.out.println("OK. Bring it on! Give me second");
        double b = scanner.nextDouble();


        Sum sum = new Sum(a, b);
        Subtraction subtraction = new Subtraction(a, b);
        Multiplication multiplication = new Multiplication(a, b);
        Dividing dividing = new Dividing(a, b);

        System.out.println("Sum of doubles: " + performCalc(sum));
        System.out.println("Subtraction of doubles: "+performCalc(subtraction));
        System.out.println("Multiplication of doubles: "+performCalc(multiplication));
        System.out.println("Dividing of doubles: "+ performCalc(dividing));
    }

    public static double performCalc(Calculable calc) {
        return calc.execute();
    }


}
