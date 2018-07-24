package homeWork5;


import java.util.Random;

public class FindBiggestNumber {
    public static void main(String[] args) {

        int[] list = createAndFillList();

        printList(list);

        int biggestInt = findBiggestInteger(list);
        System.out.println("Lielākais cipar virknē ir " + biggestInt);
    }

    private static int findBiggestInteger(int[] list) {
        int biggestInt = 0;
        for (int i = 0; i < list.length; i++) {
            if (biggestInt < list[i]) {
//                System.out.println("Cipars " + list[i] + " ir lielāks par " + biggestInt);
                biggestInt = list[i];
            }
        }
        return biggestInt;
    }

    private static void printList(int[] list) {
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
