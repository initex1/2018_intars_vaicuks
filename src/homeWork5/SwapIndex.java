package homeWork5;

import java.util.Random;

public class SwapIndex {
    public static void main(String[] args) {

        int[] list = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list[i] = random.nextInt(100);
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        int biggestInt = 0;
        int indexOfBiggestInt = 0;
        for (int i = 0; i < list.length; i++) {
            if (biggestInt < list[i]) {
//                System.out.println("Cipars " + list[i] + " ir lielāks par " + biggestInt);
                biggestInt = list[i];
                indexOfBiggestInt = i;
            }
        }
        System.out.println("Lielākais cipars ir "+biggestInt);

        if (indexOfBiggestInt != 0) {
            int tmpValue=list[0];
            list[0] = biggestInt;
            list[indexOfBiggestInt] = tmpValue;
            System.out.println("Pārvietpju \"O\" indeksa vērtību " + tmpValue + " uz indeksu " +"\""+ indexOfBiggestInt+"\"");
        }else{
            System.out.println("Lielākais cipars jau ir \"0\" indeksā");
        }
//pārbaudei
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

    }
}
