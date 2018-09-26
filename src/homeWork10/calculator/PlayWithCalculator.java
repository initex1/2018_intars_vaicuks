package homeWork10.calculator;

import java.util.Scanner;

public class PlayWithCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hi, let's play with calculator");
        System.out.println("Give me first double");
        double a=scanner.nextDouble();
        System.out.println("OK. Bring it on! Give me second");
        double b=scanner.nextDouble();

        Calculable sum=new Sum(a,b);
        Calculable subtraction=new Subtraction(a,b);
        Calculable multiplication=new Multiplication(a,b);
        Calculable dividing=new Dividing(a,b);
        System.out.println("here you go:");
        System.out.println("Sum of a and b equals "+sum.execute());
        System.out.println("A subtract b equals "+subtraction.execute());
        System.out.println("Multiplication of a and b equals "+multiplication.execute());
        System.out.println("Dividing  a with b equals "+dividing.execute());

    }
}
