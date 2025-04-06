package basics.primitive_data_types;

public class Main {
    public static void main(String[] args) {

        byte age = 1;
        short temperature = 39;
        int speed = 180;
        long time = System.currentTimeMillis();
        float saturation = 1.5f;
        double length = 2.2323;
        boolean flag = true;
        char gender = 'M';

        System.out.println(age);
        System.out.println(temperature);
        System.out.println(speed);
        System.out.println(time);
        System.out.println(saturation);
        System.out.println(length);
        System.out.println(flag);
        System.out.println(gender);

        int casting = (int) time;
        System.out.println('A');
        System.out.println('A'+1);
        System.out.println('A'+2);
    }
}
