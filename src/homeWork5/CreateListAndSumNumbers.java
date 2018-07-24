package homeWork5;

import java.util.Random;

public class CreateListAndSumNumbers {
    public static void main(String[] args) {
        int[] list = createAndFillList();

        printList(list);

        int sum = sumOfList(list);

        System.out.println("Listes ciparu summa ir: " + sum);
    }

    private static int sumOfList(int[] list) {
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum = sum + list[i];
        }
        return sum;
    }

    private static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    private static int[] createAndFillList() {
        int[] list = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list[i] = random.nextInt(100);
        }
        return list;
    }
}
