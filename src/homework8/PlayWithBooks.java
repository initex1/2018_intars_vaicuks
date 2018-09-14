package homework8;

public class PlayWithBooks {
    public static void main(String[] args) {
        Book cleanCode=new Book();
        Book codingBadPractice=new Book("Mr. ME", 2018, "Java coding BAD practice", 100);
        Book codeCooking=new Book();

        cleanCode.setAuthor("Robert Martin");
        cleanCode.setYear(2000);
        cleanCode.setTitle("Clean Code");
        cleanCode.setPageCount(123);

        codeCooking.setAuthor(" King Julian");
        codeCooking.setYear(2014);
        codeCooking.setTitle("HOW to cook JAVA code");
        codeCooking.setPageCount(50);

        System.out.println("i have good book. It's title is \""+codingBadPractice.getTitle()+"\" whose author is "+codingBadPractice.getAuthor());
        System.out.println("-----------");
        System.out.println(codeCooking);
    }
}
