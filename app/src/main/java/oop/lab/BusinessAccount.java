package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService {
    private String loanStatus; // Assuming initial status is Pending

    public BusinessAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
        
    }

    @Override
    public void transferFunds(double amount, String accountNumber) {
        withdraw(amount);
    }

    
    @Override
    public void payBills(double amount) {
        withdraw(amount);
    }

    @Override
    public void calculateInterest() {
        balance *= 1.07; // 7% interest
    }
    
    @Override
    public void applyForLoan(double amount) {
        loanStatus = "Pending";
    }

    @Override
    public String checkLoanStatus() {
        return loanStatus;
    }
}