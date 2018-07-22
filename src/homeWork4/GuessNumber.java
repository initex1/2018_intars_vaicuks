
package homeWork4;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int computerNumber = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ievadi  ciparu: ");
        int userNumber = scanner.nextInt();
        System.out.println("Mans  cipars ir "+computerNumber);   //Comment out after testing
        while (userNumber != computerNumber) {
            if (userNumber > computerNumber) {
                System.out.println("Tavs skaitlis ir lielāks");
            } else {
                System.out.println("Tavs skaitlis ir mazāks");
            }
            System.out.print("Mēģini vēlreiz : ");
            userNumber = scanner.nextInt();
        }
    }
}
