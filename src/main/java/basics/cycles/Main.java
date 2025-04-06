package basics.cycles;

public class Main {
    public static void main(String[] args) {

        System.out.println("1 test");
        for (int a = 1; a <= 100; a++) {
            if (a % 3 == 0) {
                System.out.println(a);
            }
        }

        System.out.println("2 test");
        int a = 10;
        while (a > 0){
            System.out.println(a);
            a--;
        }

        System.out.println("3 test");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {

                System.out.printf("%d * %d = %d\n", i, j, i*j);

            }
        }
    }
}
