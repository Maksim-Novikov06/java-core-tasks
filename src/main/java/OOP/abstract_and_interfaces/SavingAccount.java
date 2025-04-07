package OOP.abstract_and_interfaces;

public class SavingAccount extends Account implements Printable {

    public SavingAccount(int balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < balance) {
            balance -= amount;
        }else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void printInfo() {
        System.out.printf("Balance: %.2f - SavingAccount\n", balance);
    }

}
