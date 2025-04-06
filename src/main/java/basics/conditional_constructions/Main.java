package basics.conditional_constructions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number(1-5)(1 — комедия, 2 — драма, 3 — фантастика, 4 — боевик, 5 — аниме).");
        int a = sc.nextInt();

        if (a < 1 || a > 5) {
            System.out.println("Invalid input");
        }
        switch (a){
            case 1:
                System.out.println("1 + 1");
                System.out.println("1 + 2");
                System.out.println("1 + 3");
                break;

            case 2:
                System.out.println("2 + 1");
                System.out.println("2 + 2");
                System.out.println("2 + 3");
                break;

            case 3:
                System.out.println("3 + 1");
                System.out.println("3 + 2");
                System.out.println("3 + 3");
                break;

            case 4:
                System.out.println("4 + 1");
                System.out.println("4 + 2");
                System.out.println("4 + 3");
                break;

            case 5:
                System.out.println("5 + 1");
                System.out.println("5 + 2");
                System.out.println("5 + 3");
                break;
        }
    }
}
