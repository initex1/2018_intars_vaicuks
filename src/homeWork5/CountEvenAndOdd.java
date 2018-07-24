package homeWork5;

import java.util.Random;

public class CountEvenAndOdd {
    public static void main(String[] args) {
        int[] list = createLAndFillList();

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }


        int evenSum = 0;
        int oddSum = 0;

        evenSum = countEvenNumbers(list, evenSum);
        oddSum = coutOddNumbers(list, oddSum);

        System.out.println("Pāra skaitļu summa ir: " + evenSum);
        System.out.println("Nepāra skaitļu summa ir: " + oddSum);
    }

    private static int coutOddNumbers(int[] list, int oddSum) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 1) {
                oddSum = oddSum + list[i];
            }
        }
        return oddSum;
    }

    private static int countEvenNumbers(int[] list, int evenSum) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) {
                evenSum = evenSum + list[i];
            }
        }
        return evenSum;
    }

    private static int[] createLAndFillList() {
        int[] list = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list[i] = random.nextInt(100);
        }
        return list;
    }
}
