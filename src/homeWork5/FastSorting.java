
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
//                swap(list, firstPointer, secondPointer);
                swap(list, firstPointer++, secondPointer++);
//                firstPointer++;    //no need for this line
//                secondPointer--;   //no need for this line
            }
        }
        return firstPointer;
    }


    public static void quickSort(int[] list, int firstPointer, int secondPointer) {

        if (firstPointer >= secondPointer) {
            //return in a void method is a bad style
            //just replace if condition
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

    // use constants over "magic numbers"
    public static int[] createAndFillList() {
        int[] list = new int[10]; //magic number
        Random random = new Random();

        for (int i = 0; i < list.length; i++) {
            list[i] = random.nextInt(100);//magic number
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
