package oop.lab;

abstract class BankAccount {
    public String accountNumber;
    public String accountHolder;
    public double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;

    }
}
