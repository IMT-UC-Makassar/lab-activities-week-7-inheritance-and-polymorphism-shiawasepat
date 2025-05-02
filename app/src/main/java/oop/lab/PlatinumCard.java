package oop.lab;

class PlatinumCard extends Card {
    public PlatinumCard(String cardNumber, String cardHolder) {
        super(cardNumber, cardHolder);
    }
    
    @Override
    public double getInterestRate() {
        return 10.0;
    }
}
