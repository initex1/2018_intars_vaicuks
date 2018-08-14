
package homeWork5;

import java.util.Random;

public class FastSorting {

    public static void main(String[] args) {
        int[] list = createAndFillList();
        printList(list);
        System.out.println("--------");
        quickSort(list, 0, list.length - 1);
        System.out.println();
        printList(list);
        System.out.println("--------");

    }


    private static int doPartitioning(int[] list, int firstPointer, int secondPointer, int pivot) {
        while (firstPointer <= secondPointer) {
            while (list[firstPointer] < pivot) {
                firstPointer++;
            }
            while (list[secondPointer] > pivot) {
                secondPointer--;
            }
            if (firstPointer <= secondPointer) {
                swap(list, firstPointer, secondPointer);
                firstPointer++;
                secondPointer--;
            }
        }
        return firstPointer;
    }


    public static void quickSort(int[] list, int firstPointer, int secondPointer) {
        if (firstPointer >= secondPointer) {
            return;
        }
        int pivot = list[(firstPointer + secondPointer) / 2];
        int newIndex = doPartitioning(list, firstPointer, secondPointer, pivot);
        quickSort(list, firstPointer, newIndex - 1);
        quickSort(list, newIndex, secondPointer);
    }


    private static int[] swap(int[] list, int firstPointer, int secondPointer) {
        int tmpIndex = list[secondPointer];
        list[secondPointer] = list[firstPointer];
        list[firstPointer] = tmpIndex;
        return list;
    }

    public static int[] createAndFillList() {
        int[] list = new int[10];
        Random random = new Random();

        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(100);
        }
        return list;
    }

    public static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
        System.out.println();
    }
}
