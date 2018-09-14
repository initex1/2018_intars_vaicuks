package homework8;

public class Book {
    String author;
    int year;
    String title;
    int pageCount;

   public Book(){

   }

    public Book(String author, int year, String title, int pageCount){
        this.author=author;
        this.year=year;
        this.title=title;
        this.pageCount=pageCount;
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


    @Override
    public String toString(){
       String forReturn=this.getAuthor()+" "+ this.getYear()+" "+this.getTitle()+" "+this.getPageCount();
       return  forReturn;
    }
}
