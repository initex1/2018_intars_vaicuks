package homeWork5;

import java.util.Collections;
import java.util.Random;

public class FindBiggesNumber {
    public static void main(String[] args) {

        int[] list = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list[i] = random.nextInt(100);
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        int biggestInt = 0;
        for (int i = 0; i < list.length; i++) {
            if (biggestInt < list[i]) {
//                System.out.println("Cipars " + list[i] + " ir lielāks par " + biggestInt);
                biggestInt = list[i];
            }
        }
        System.out.println("Lielākais cipar virknē ir " + biggestInt);
    }
}
