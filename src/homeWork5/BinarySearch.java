package homeWork5;

import java.util.Random;
/*
 Pirmais patstāvīgais rekursijas risinānums:)
*/

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
        int searchIndex = doBinarySearch(list, numberToCompare, 0, list.length - 1);
        if (searchIndex >= 0) {
            System.out.println("Atradu ciparu zem indeksa " + searchIndex);
        } else {
            System.out.println("Nav tāda cipara");
        }
    }

    private static int getRandomNumberFromList(int[] list) {
        Random random = new Random();
        int randomIndex = random.nextInt(list.length - 1);
        return randomIndex;

    }

    public static int doBinarySearch(int[] list, int findNumber, int lowestMargin, int highestMargin) {

        if (highestMargin - lowestMargin >= 0) {
            int testIndex = (highestMargin + lowestMargin) / 2;
            int testInteger = list[testIndex];
//        System.out.println(testIndex+" "+ testInteger);
            if (testInteger > findNumber) {
                highestMargin = testIndex - 1;
//           System.out.println("Pārbaudāmā vērtība: " + testInteger + " zem indeksa " + testIndex + ". Veicu pirmo if'u - griesti : " + highestMargin);
                return doBinarySearch(list, findNumber, lowestMargin, highestMargin);

            } else if (testInteger < findNumber) {
                lowestMargin = testIndex + 1;
//           System.out.println("Pārbaudāmā vērtība: " + testInteger + " zem indeksa " + testIndex + ". Veicu otro if'u - grīda: " + lowestMargin);
                return doBinarySearch(list, findNumber, lowestMargin, highestMargin);

            } else if (testInteger == findNumber) {
                System.out.println(testIndex);
                return testIndex;
            }
        }
        return -1;
    }

}
