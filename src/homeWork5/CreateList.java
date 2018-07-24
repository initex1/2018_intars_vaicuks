package homeWork5;


import java.util.Random;

public class CreateList {
    public static void main(String[] args) {
        int[] list = createAndFillList();

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
