package basics.string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter greeting: ");
        String greeting = sc.nextLine();
        System.out.println(greeting.length());
        System.out.println(greeting.toUpperCase());

        if (greeting.contains("Java")){
            System.out.println(greeting.indexOf("Java"));
        }else{
            System.out.println("Not Java");
        }

        String[] array = greeting.split(" ");
        for (String s : array) {
            System.out.println(s);
        }
    }
}
