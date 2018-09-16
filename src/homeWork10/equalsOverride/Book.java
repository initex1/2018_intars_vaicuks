package homeWork10.equalsOverride;

public class Book {
    String author;
    int year;
    String title;
    int pageCount;

    public Book() {

    }

    public Book(String author, int year, String title, int pageCount) {
        this.author = author;
        this.year = year;
        this.title = title;
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }


    public boolean equals(Book b) {
        boolean isEqual = false;
        if (compareString(this.author, b.getAuthor()) &&
                compareInt(this.year, b.getYear()) &&
                compareString(this.title, b.getTitle()) &&
                compareInt(this.pageCount, b.getPageCount())) {
            isEqual = true;
        }
        return isEqual;
    }

    public boolean compareString(String a, String b) {
        boolean isEqual = false;
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == b.charAt(i)) {
                    isEqual = true;
                }
            }
        }
        System.out.println("Are strings equals? " + isEqual);
        return isEqual;
    }

    public boolean compareInt(int a, int b) {
        boolean isEqual = false;
        if (a == b) {
            isEqual = true;
        }
        System.out.println("Are integers equals? " + isEqual);
        return isEqual;
    }
}
