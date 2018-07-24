package homeWork1;

import java.util.Scanner;

public class CalculateDiscriminant {
    public static void main(String[] args) {
        System.out.println("Ievadīto skaitļu diskriminants ir: " + calcDiscriminant());

    }

    //Šī metode būtu jāsadala uz pusēm, jo pēc būtības tā dara divas lietas: prasa ievadīt datus un izrēķina diskriminantu.
    //Jācenšas pēc iespējas sadalīt atbīldības pa metodēm vai vismaz nelikt visu vienā
    //metodei šos skaitļus vienkāŗši janodod kā parametrus un datu ievadi var atstāt main metodē
    //P.S Tā kā tas ir darīts CalculateRoots
    private static int calcDiscriminant() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lūdzu, ievadi pirmo skaitli");
        int numberA = scanner.nextInt();
        System.out.println("Lūdzu, ievadi otro skaitli");
        int numberB = scanner.nextInt();
        System.out.println("Lūdzu, ievadi trešo skaitli");
        int numberC = scanner.nextInt();
        return (numberB * numberB) - (4 * numberA * numberC);
    }
}
