package model;

import interfaces.MoneyReceivable;

public class CardAcceptor implements MoneyReceivable {
    private int amount;
    private int cardNumber;
    private String password;

    public CardAcceptor(int amount, int cardNumber, String password) {
        this.amount = amount;
        this.cardNumber = cardNumber;
        this.password = password;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
