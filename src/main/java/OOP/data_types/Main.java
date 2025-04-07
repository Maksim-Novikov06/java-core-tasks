package OOP.data_types;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        Person person = new Person("John", "Doe", 25);
        System.out.println(person.age);
        System.out.println(person.name);
        System.out.println(person.surname);

        person = null;
        System.gc();

    }
}
