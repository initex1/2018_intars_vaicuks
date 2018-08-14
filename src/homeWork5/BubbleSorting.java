package homeWork5;

import java.util.Random;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] list = createAndFillList();

        printList(list);

        sortList(list);
        System.out.println();
        System.out.println("pēc pārtošanas");
        printList(list);
    }

    private static void sortList(int[] list) {
        int count = 0;
        do {
            sortingStep(list);
            count++;
        } while (count != list.length);
    }

    private static void sortingStep(int[] list) {
        for (int i = 0; i < list.length; i++) {
            if (i != list.length - 1) {
                if (list[i] > list[i + 1]) {
                    int tmpValue = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = tmpValue;
                }
            }
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

    private static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+", ");
        }
    }

}
