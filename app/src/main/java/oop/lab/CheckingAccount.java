package oop.lab;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
        // Checking accounts typically don't earn interest
    }
}
