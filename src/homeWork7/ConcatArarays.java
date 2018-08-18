package homeWork7;

import java.util.Scanner;

public class ConcatArarays {


    public static void main(String[] args) {
        char[] listOne = new char[3];
        char[] listTwo = new char[3];
        System.out.println("Hais! Mums vajag aizpidīt divas listes un tad savienot tās. Aizpilkdi pirmo listi");
        fillList(listOne);
        System.out.println("Pirmā liste ir gatava");
        fillList(listTwo);
        System.out.println("Ok.otrā arī ir. Taisam jaunu listi, kuras ietilpība būs pirmās un otrās summa");
        char[] mergedList = mergeLists(listOne, listTwo);
        printNewList(mergedList);

    }

    private static void printNewList(char[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }

    private static char[] mergeLists(char[] listOne, char[] listTwo) {
        char[] finalList = new char[(listOne.length) + (listTwo.length)];
        System.out.println(finalList.length);

        int index = 0;
        for (int i = 0; i <= listOne.length - 1; i++) {
            finalList[index] = listOne[i];
            index++;
        }
        for (int j = 0; j <= listTwo.length - 1; j++) {
            finalList[index] = listTwo[j];
            index++;
        }
        return finalList;
    }

    private static void fillList(char[] list) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.next(".").charAt(0);
        }

    }


}
