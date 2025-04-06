package basics.final_basic_project;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int contactCounter = 0;

        String[] names = new String[100];
        String[] phoneNumbers = new String[100];
        String name;
        while (flag){
            System.out.println("\nSelect the command:\n1. Add contact\n2. View a contact\n3. Find a contact\n4. Remove contact\n5. Exit\n ");
            System.out.print("Enter your choice: ");

            char choice = '6';
            String command = sc.nextLine();
            if (command.length() == 1){
                choice = command.charAt(0);
            }else {
                System.out.println("Please enter a valid choice");
            }


            switch (choice){
                case '1':
                    System.out.println("The command is selected: Add contact");
                    if (contactCounter < 100){

                        System.out.print("\nEnter the contact's name: ");
                        String contactName = sc.nextLine();

                        System.out.print("Enter the contact's phone number(Example - 8 999 999 99 99): ");
                        String phoneNumber = sc.nextLine();

                        names[contactCounter] = contactName;
                        phoneNumbers[contactCounter] = phoneNumber;

                        contactCounter++;
                    }else {
                        System.out.println("The contact list is full. Delete an unnecessary contact\n");
                    }

                    break;
                case '2':
                    System.out.println("The command is selected: View a contact\n");

                    if (contactCounter == 0){
                        System.out.println("The contact list is empty!\n");
                    }else {
                        for (String i : names) {
                            if (i != null && !i.isEmpty()) {
                                System.out.println(i);
                            }
                        }
                    }
                    break;
                case '3':
                    System.out.println("The command is selected: Find a contact");

                    System.out.print("Enter the contact's name: ");
                    name = sc.nextLine();

                    if (name != null && !name.isEmpty()) {
                        int counter = 0;
                        for (int i = 0; i < names.length; i++) {
                            if (name.equals(names[i])) {
                                System.out.printf("%s %s\n", names[i], phoneNumbers[i]);
                                counter++;
                            }
                        }
                        if (counter == 0) {
                            System.out.println("Contact not found");
                        }
                    }

                    break;
                case '4':
                    System.out.println("The command is selected: Remove contact");

                    System.out.print("Enter the contact's name: ");
                    name = sc.nextLine();

                    if (name != null && !name.isEmpty()) {
                        int counter = 0;
                        for (int i = 0; i < names.length; i++) {
                            if (name.equals(names[i])) {
                                System.out.printf("Contact: %s %s - deleted\n", names[i], phoneNumbers[i]);

                                phoneNumbers[i] = null;
                                names[i] = null;

                                for (int j = i; j < phoneNumbers.length; j++){
                                    if (i != 0) {
                                        phoneNumbers[i - 1] = phoneNumbers[j];
                                        names[i - 1] = phoneNumbers[j];
                                    }
                                }
                                contactCounter--;
                                counter++;
                            }
                        }
                        if (counter == 0) {
                            System.out.println("Contact not found");
                        }
                    }



                    break;
                case '5':
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
