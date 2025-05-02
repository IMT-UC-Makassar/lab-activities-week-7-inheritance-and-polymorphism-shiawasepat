package oop.lab;

public class Card {
    public String cardNumber;
    public String cardHolder;
    public double balance;
    
    public Card(String cardNumber, String cardHolder) {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
    }

    public double getInterestRate() {
        return 0.0;
    }
}
