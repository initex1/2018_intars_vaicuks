package homeWork7;

import java.util.Scanner;

public class CheckSymmetry {
    public static void main(String[] args) {
        int listSize = 6;  //it's a constant
        char[] array = new char[listSize];
        System.out.println("Aizpildām listi...");
        //try to avoid passing objects for population
        fillList(array);  //it's better to create method - createAndFillArray (return new filled array)
        printNewList(array);
        boolean isSymmetric=checkForSymmetry(array);
        System.out.println("Is array symmetrical: "+isSymmetric);
    }

    private static boolean checkForSymmetry(char[] array) {
        int firstPointer=0;
        int lastPointer=array.length-1;
        if(lastPointer-firstPointer>=0){
            for(int i=0;i<array.length-1;i++){
                if(array[firstPointer]==array[lastPointer]){
                    firstPointer++;
                    lastPointer--;
                    return true;
                }
            }
        }
        return false;
    }

    private static char[] fillList(char[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.next(".").charAt(0);
        }
        return array;
    }

    private static void printNewList(char[] list) {
    //use at least "foreach" loop
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + ", ");
        }
    }
}
