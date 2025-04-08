package OOP.project_oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    Scanner sc = new Scanner(System.in);

    String title, author;
    int year;
    public List<Publication> publications = new ArrayList<Publication>();

    public void addPublication() {

        System.out.print("Please select the type of publication: 1 - Book, 2 - Magazine, 3 - Newspaper: ");


        String selection = sc.nextLine();
        if (selection.length() == 1) {
            char type = selection.charAt(0);
            switch (type) {
                case '1':
                    System.out.println("The type is selected: Book\n");

                    System.out.print("Please enter the ISBN of the publication: ");
                    String ISBN = sc.nextLine();
                    System.out.print("Please enter the title of the publication: ");
                    title = sc.nextLine();
                    System.out.print("Please enter the author of the publication: ");
                    author = sc.nextLine();
                    System.out.print("Please enter the year of the publication: ");
                    year = sc.nextInt();
                    sc.nextLine();
                    Publication book = new Book(title, author, year, ISBN);
                    publications.add(book);
                    break;
                case '2':
                    System.out.println("The type is selected: Magazine");

                    System.out.print("Please enter the issueNumber of the publication: ");
                    int issueNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Please enter the title of the publication: ");
                    title = sc.nextLine();
                    System.out.print("Please enter the author of the publication: ");
                    author = sc.nextLine();
                    System.out.print("Please enter the year of the publication: ");
                    year = sc.nextInt();
                    sc.nextLine();
                    Publication magazine = new Magazine(title, author, year, issueNumber);
                    publications.add(magazine);
                    break;

                case '3':
                    System.out.println("The type is selected: Newspaper");

                    System.out.print("Please enter the publicationDay: ");
                    String publicationDay = sc.nextLine();
                    System.out.print("Please enter the title of the publication: ");
                    title = sc.nextLine();
                    System.out.print("Please enter the author of the publication: ");
                    author = sc.nextLine();
                    System.out.print("Please enter the year of the publication: ");
                    year = sc.nextInt();
                    sc.nextLine();

                    Publication newspaper = new Newspaper(title, author, year, publicationDay);
                    publications.add(newspaper);
                    break;
            }
        } else {
            System.out.println("Please enter a valid choice");
            addPublication();
        }


        Publication.setPublicationCount(this.publications.size());
    }

    public void listPublications() {
        for (Publication publication : this.publications) {
            System.out.println(publication);
        }
    }

    public void removePublication() {
        System.out.print("Please enter the title of the publication: ");
        title = sc.nextLine();
        System.out.print("Please enter the author of the publication: ");
        author = sc.nextLine();
        System.out.print("Please enter the year of the publication: ");
        year = sc.nextInt();
        sc.nextLine();
        this.publications.removeIf(publication -> publication.getTitle().equals(title) && publication.getAuthor().equals(author) && publication.getYear() == year);
        Publication.setPublicationCount(this.publications.size());
    }

    public void searchByAuthor() {
        System.out.print("Please enter the author of the publication: ");
        String author = sc.nextLine();
        for (Publication publication : this.publications) {
            if (publication.getAuthor().equals(author)) {
                System.out.println(publication);
            }
        }
    }

}
