package basics.operators;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 number(0-10)");
        int a = sc.nextInt();
        System.out.println("Enter 2 number(0-10)");
        int b = sc.nextInt();
        System.out.println("Enter 3 number(0-10)");
        int c = sc.nextInt();
        if (a < 0 || b < 0 || c < 0 || a > 10 || b > 10 || c > 10) {
            System.out.println("Invalid input");
        }
        double avg = (double) (a + b + c) / 3;

        if (a == 10 && b == 10 && c == 10) {
            System.out.println("У студента все оценки максимальные");
        } else if (a <= 2 || b <= 2 || c <= 2) {
            System.out.println("Встречается очень низкая оценка!");
        }
        if (avg >= 5) {
            System.out.println("У студента удовлетворительная успеваемость");
        } else {
            System.out.println("У студента неудовлетворительная успеваемость");
        }
    }
}
