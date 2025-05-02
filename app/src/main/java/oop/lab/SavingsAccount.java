package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {
    
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void calculateInterest() {
    balance *= 1.05; // 5% interest
    }
}
