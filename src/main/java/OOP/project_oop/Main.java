package OOP.project_oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();


        boolean flag = true;

        while (flag) {
            System.out.println("\nSelect the command:\n1. Add publication\n2. View all publications\n3. Find a publication by author\n4. Remove publication\n5. Number of publications\n6. Exit\n ");
            System.out.print("Enter your choice: ");

            char choice = '6';
            String command = sc.nextLine();
            if (command.length() == 1) {
                choice = command.charAt(0);
            } else {
                System.out.println("Please enter a valid choice");
            }


            switch (choice) {
                case '1':
                    System.out.println("The command is selected: Add publication");

                    library.addPublication();

                    break;
                case '2':
                    System.out.println("The command is selected: View all publications\n");

                    library.listPublications();

                    break;
                case '3':
                    System.out.println("The command is selected: Find a publication by author");

                    library.searchByAuthor();

                    break;
                case '4':
                    System.out.println("The command is selected: Remove publication");

                    library.removePublication();
                    break;
                case '5':
                    System.out.println("The command is selected: Number of publications");
                    Publication.getPublicationCount();
                    break;
                case '6':
                    System.out.println("The command is selected: Exit");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid choice!!!\n");
                    break;
            }
        }
    }
}
