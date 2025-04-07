package OOP.introduction;

public class Book {

    String title;
    String author;
    int pages;

    public void read(){
        System.out.printf("You are reading the book of the %s. The author is %s\n", title, author);
    }
}
