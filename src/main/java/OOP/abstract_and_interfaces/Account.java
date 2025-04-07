package OOP.abstract_and_interfaces;

public abstract class Account {
    double balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    };

    public abstract void withdraw(double amount);


}
