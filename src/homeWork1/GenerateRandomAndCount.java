package homeWork1;

import java.util.Random;

//OK, lieto kombināciju ctrl+left_alt+l
public class GenerateRandomAndCount {

    public static void main(String[] args) {
        System.out.println("Hais! Es tagad izdomāšu trīs ciparus un tos saskaitīšu");
        Random random = new Random();
        int numberOne = random.nextInt(100) + 0;
        System.out.println("pirmais cipars ir " + numberOne);
        int numberTwo = random.nextInt(100) + 0;
        System.out.println("pirmais cipars ir " + numberTwo);
        int numberThree = random.nextInt(100) + 0;
        System.out.println("pirmais cipars ir " + numberThree);
        System.out.println("Šito skaitļu summa ir " + (numberOne + numberTwo + numberThree));
    }
}

