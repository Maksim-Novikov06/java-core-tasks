package OOP.abstract_and_interfaces;

public class CreditAccount extends Account implements Printable {
    public CreditAccount(int balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -5000) {
            balance -= amount;
        }else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void printInfo() {
        System.out.printf("Balance: %.2f - CreditAccount\n", balance);
    }
}
