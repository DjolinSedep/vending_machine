package model;

import interfaces.MoneyReceivable;

public class CardAcceptor implements MoneyReceivable {
    private int amount;
    private int cardNumber;
    private String password;

    public CardAcceptor(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
