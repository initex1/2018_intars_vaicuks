package homeWork5;

import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = FastSorting.createAndFillList();
        FastSorting.printList(list);
        FastSorting.quickSort(list, 0, list.length - 1);
        System.out.println("--------------------------");
        System.out.println("Liste pēc kārtošanas");
        FastSorting.printList(list);
        System.out.println("--------------------------");
        int numberToCompare = list[getRandomNumberFromList(list)];
        System.out.println("Man vajag atrast šo skaitli: " + numberToCompare);
        doBinarySearch(list, numberToCompare, 0, list.length);
    }

    private static int getRandomNumberFromList(int[] list) {
        Random random = new Random();
        int randomIndex = random.nextInt(list.length - 1);
        return randomIndex;

    }

    public static void doBinarySearch(int[] list, int findNumber, int lowestMargin, int highestMargin) {
        int testIndex = (highestMargin + lowestMargin) / 2;
        int testInteger = list[testIndex];
        if (testInteger > findNumber) {
            highestMargin = testIndex - 1;
//            System.out.println("Pārbaudāmā vērtība: " + testInteger + " zem indeksa " + testIndex + ". Veicu pirmo if'u - griesti : " + highestMargin);
            doBinarySearch(list, findNumber, lowestMargin, highestMargin);
        } else if (testInteger < findNumber) {
            lowestMargin = testIndex + 1;
//            System.out.println("Pārbaudāmā vērtība: " + testInteger + " zem indeksa " + testIndex + ". Veicu otro if'u - grīda: " + lowestMargin);
            doBinarySearch(list, findNumber, lowestMargin, highestMargin);
        } else if (testInteger == findNumber) {
            System.out.println("Atradu ciparu zem indeksa: " + testIndex);
        }

    }
}
