package homeWork5;

import java.util.Random;

public class CreateListAndSumNumbers {
    public static void main(String[] args) {
        int[] list = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list[i] = random.nextInt(100);
        }

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        int sum=0;
        for (int i=0;i<list.length;i++){
            sum=sum+list[i];
        }

        System.out.println("Listes ciparu summa ir: "+sum);
    }
}
