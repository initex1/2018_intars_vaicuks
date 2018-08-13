package homeWork5;

import java.util.Random;
import java.util.Scanner;

public class LongestRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vajadzētu uztaisīt 2D masīvu. Cik rindas Tu gribētu?");
        int row = scanner.nextInt();
        System.out.println("Labi. Būs " + row + " rindas. Cik gribēsi kolonnas?");
        int col = scanner.nextInt();
        System.out.println("Labi. Būs " + col + " kolonnas.");
        int[][] array = new int[row][col];
        System.out.println("Ja vēlies veidot masīvu pats, tad ievadi \"0\". Ja ļausi man, tad \"1\".");
        System.out.print("Izvēle: ");
        makeChoiceOfDataFiller(scanner, array);
        printArray(array);
        System.out.println("OK. Liste ir - meklējam garāko secīgo virkni...");
        getRowWithLongestList(checkElementsInList(array, row, col));
    }

    private static void makeChoiceOfDataFiller(Scanner scanner, int[][] array) {
        int choice = scanner.nextInt();
        if (choice == 0) {
            userIsFillingData(array);
        } else {
            System.out.println("OK. Tūlīt sadarīšu... Gatavs.");
            computerIsFillingData(array);
        }
    }

    private static void getRowWithLongestList(int[][] array) {
        int biggestValue = -1;
        int rowIndex = -1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {  //Slinkums pieveica - nepārbaudu vai ir rindas ar tādu pašu secīgo elementu skaitu. Ņemu pirmo ar lielāko skatli.
                if (array[i][j] > biggestValue) {
                    biggestValue = array[i][j];
                    rowIndex = i;
                }
            }
        }
        System.out.println("*************");
        System.out.println("Rinda " + (rowIndex + 1) + " satur visgarāko virkni");
    }

    private static int[][] checkElementsInList(int[][] array, int row, int col) {
        int[][] ghostList = new int[row][col];
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            int previousElement = -1;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == previousElement) {
                    counter++;
                    ghostList[i][j] = counter;
                } else {
                    previousElement = array[i][j];
                    counter = 0;
                    ghostList[i][j] = counter;

                }
            }
        }
        System.out.println("Apstrādes rezultāts");
        System.out.println("=============");
        printArray(ghostList);
        return ghostList;
    }

    private static void computerIsFillingData(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(9);
            }
        }
    }

    private static void userIsFillingData(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi rindas saturu ciparu atdalot ar komatu. Piemērs: 1,1,2,3,3");
        for (int i = 0; i < array.length; i++) {
            String x = scanner.next();
            String[] stringList = x.split(",");
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Integer.parseInt(stringList[j]);
            }
            if (i < array.length - 1) {
                System.out.println("OK. Bliežam nākošo rindu...");
            }
        }
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("==============");
    }
}
