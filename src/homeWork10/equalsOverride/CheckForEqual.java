package homeWork10.equalsOverride;

public class CheckForEqual {
    public static void main(String[] args) {
        Book a = new Book("Me", 2000, "XXX", 50);
        Book b = new Book("Me", 2000, "XXX", 50);



        System.out.println("Are theese books the same? "+a.equals(b));




    }
}
