package oop.lab;

public abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient funds");
        }
    }

    public abstract void calculateInterest();
    

    public double getBalance() {
        return balance;
    }

    public void payBills(double amount) {
        withdraw(amount);
    }

    public void transferFunds(double amount, String accountNumber) {
        withdraw(amount);
    }
}    
