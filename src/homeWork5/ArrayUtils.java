package homeWork5;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {

    // konstantes definešana - masīva lielums

    private static final int ARRAY_SIZE = 10;

    // konstantes definešana - lielākais nejaušais skaitlis

    private static final int MAX_RANDOM_NUMBER = 100;

    public static void main(String[] args) {
        int[] array = new int[ARRAY_SIZE];

        fillArrayWithRandomNumbers(array);
        printArrayToConsole(array);

        int arraySum = calculateArraySum(array);
        System.out.println("Array sum = " + arraySum);

        int evenNumbersCount = countEvenNumbersInArray(array);
        System.out.println("Even numbers count = " + evenNumbersCount);

        int oddNumbersCount = countOddNumbersInArray(array);
        System.out.println("Odd numbers count = " + oddNumbersCount);

        sortList(array);
        printArrayToConsole(array);

        int biggestInteger = findBiggestInteger(array);
        System.out.println("Biggest number = " + biggestInteger);

        int smallestInteger = findSmallestInteger(array);
        System.out.println("Smallest number = " + smallestInteger);

        int searchNumber = getUserInput();
        int foundItIndex = doBinarySearch(array, searchNumber, 0, array.length - 1);
        if (foundItIndex >= 0) {
            System.out.println("Atradu ciparu zem indeksa " + foundItIndex);
        } else {
            System.out.println("Tāda cipara listē nemaz nav!!!");
        }
    }


    private static void fillArrayWithRandomNumbers(int[] array) {

        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomNumber = randomGenerator.nextInt(MAX_RANDOM_NUMBER);
            array[i] = randomNumber;
        }
    }


    private static void printArrayToConsole(int[] array) {

        System.out.println("Print array to console: ");
        for (int i = 0; i < array.length; i++) {
            int arrayElement = array[i];
            System.out.print(arrayElement + " ");
        }
        System.out.println();
    }

    private static int calculateArraySum(int[] array) {

        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            int arrayElement = array[i];
            arraySum = arraySum + arrayElement;
        }
        return arraySum;
    }


    private static int countEvenNumbersInArray(int[] array) {

        int evenNumbersCount = 0;
        for (int i = 0; i < array.length; i++) {
            int arrayElement = array[i];
            if (arrayElement % 2 == 0) {
                evenNumbersCount += 1;
            }
        }
        return evenNumbersCount;
    }

    private static int countOddNumbersInArray(int[] array) {

        int oddNumbersCount = 0;
        for (int i = 0; i < array.length; i++) {
            int arrayElement = array[i];
            if (arrayElement % 2 == 1) {
                oddNumbersCount += 1;
            }
        }
        return oddNumbersCount;
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

    private static int findBiggestInteger(int[] list) {
        int biggestInt = 0;
        for (int i = 0; i < list.length; i++) {
            if (biggestInt < list[i]) {
                biggestInt = list[i];
            }
        }
        return biggestInt;
    }

    private static int findSmallestInteger(int[] list) {
        int smallestInt = findBiggestInteger(list);
        for (int i = 0; i < list.length; i++) {
            if (smallestInt > list[i]) {
                smallestInt = list[i];
            }
        }
        return smallestInt;
    }

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi ciparu meklēšanai...");
        int searchNumber = scanner.nextInt();
        return searchNumber;
    }

    public static int doBinarySearch(int[] list, int findNumber, int lowestMargin, int highestMargin) {
        if (highestMargin - lowestMargin >= 0) {
            int testIndex = (highestMargin + lowestMargin) / 2;
            int testInteger = list[testIndex];

            if (testInteger > findNumber) {
                highestMargin = testIndex - 1;
                return doBinarySearch(list, findNumber, lowestMargin, highestMargin);

            } else if (testInteger < findNumber) {
                lowestMargin = testIndex + 1;
                return doBinarySearch(list, findNumber, lowestMargin, highestMargin);

            } else if (testInteger == findNumber) {
                return testIndex;
            }
        }
        return -1;
    }
}
