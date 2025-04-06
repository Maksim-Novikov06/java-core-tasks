package basics.array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number " + (i+1) + ":");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
