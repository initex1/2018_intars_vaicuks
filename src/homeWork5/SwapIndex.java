package homeWork5;

import java.util.Random;

public class SwapIndex {
    public static void main(String[] args) {

        int[] list = createAndFillList();

        printList(list);

        int biggestInt = findBiggestInteger(list);
        int indexOfBiggestInt = findBiggestIntegerIndex(list, biggestInt);

        System.out.println("Lielākais cipars ir " + biggestInt);
        System.out.println("Indekss ir " + indexOfBiggestInt);

        swapIndex(list, biggestInt, indexOfBiggestInt);
//pārbaudei
        printList(list);

    }

    private static void swapIndex(int[] list, int biggestInt, int indexOfBiggestInt) {
        if (indexOfBiggestInt != 0) {
            int tmpValue = list[0];
            list[0] = biggestInt;
            list[indexOfBiggestInt] = tmpValue;
            System.out.println("Pārvietpju \"O\" indeksa vērtību " + tmpValue + " uz indeksu " + "\"" + indexOfBiggestInt + "\"");
        } else {
            System.out.println("Lielākais cipars jau ir \"0\" indeksā");
        }
    }

    private static int findBiggestInteger(int[] list) {
        int biggestInt = 0;

        for (int i = 0; i < list.length; i++) {
            if (biggestInt < list[i]) {
//                System.out.println("Cipars " + list[i] + " ir lielāks par " + biggestInt);
                biggestInt = list[i];
            }
        }
        return biggestInt;
    }

    private static int findBiggestIntegerIndex(int[] list, int biggestInt) {
        int indexOfBiggestInt = 0;

        for (int i = 0; i < list.length; i++) {
            if (biggestInt == list[i]) {
                indexOfBiggestInt = i;
                System.out.println("ddd " + indexOfBiggestInt);
            }
        }
        return indexOfBiggestInt;
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
