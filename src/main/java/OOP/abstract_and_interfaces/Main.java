package OOP.abstract_and_interfaces;

public class Main {
    public static void main(String[] args) {
        SavingAccount sa1 = new SavingAccount(5000);
        Printable sa2= new SavingAccount(60000);

        CreditAccount c1 = new CreditAccount(5000);
        Printable c2 = new CreditAccount(60000);

        sa1.withdraw(6000);
        sa2.printInfo();

        c1.withdraw(10000);
        c2.printInfo();
    }
}
