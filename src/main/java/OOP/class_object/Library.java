package OOP.class_object;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("13", "John Smith");
        Book book2 = new Book("12", "John Smith");

        System.out.println(book1.equals(book2));
        ;
    }
}
