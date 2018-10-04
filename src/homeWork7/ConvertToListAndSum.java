package homeWork7;

import java.util.Scanner;

public class ConvertToListAndSum {
    public static void main(String[] args) {
        System.out.println("Iedod man listi ar cipariem, kas atdalīti ar tukšuma taustiņu");
        String list = getString();
        int sumOfList= getSumOfList(convertToIntList(list));
        System.out.println("Listes ciparu summa: "+sumOfList);
    }

    private static int getSumOfList(int[] list) {
        int sum=0;
        //use foreach
        for (int i=0;i<list.length;i++){
            sum=sum+list[i]; //sum += list[i]
        }
        return sum;
    }

    private static int[] convertToIntList(String list) {
        String[] stringList = list.split(" ");
        System.out.println(stringList.length);
        int[] intList = new int[stringList.length];
        for (int i = 0; i < stringList.length; i++) {
            intList[i] = Integer.parseInt(stringList[i]);
        }
        return intList;
    }

    private static String getString() {
        Scanner scanner = new Scanner(System.in);
        String list = scanner.nextLine(); //useless local variable
        return list;
    }
}
