package com.progressoft.induction;

public class SnackMachine {
    static final Long DEFAULT_QUANTITY = 10L;

    private Money moneyInside;
    private Money moneyInTransaction;

    private Snack chewingGums;
    private Snack chips;
    private Snack chocolates;

    public SnackMachine() {
        this.moneyInside = Money.ZERO;
        this.moneyInTransaction = Money.ZERO;
        this.chewingGums = new Snack(DEFAULT_QUANTITY, SnackType.CHEWING_GUM.price());
        this.chips = new Snack(DEFAULT_QUANTITY, SnackType.CHIPS.price());
        this.chocolates = new Snack(DEFAULT_QUANTITY, SnackType.CHOCOLATE.price());

    }
    public Money moneyInside () {
        return moneyInside;
    }

    public Money moneyInTransaction() {
        return moneyInTransaction;
    }

    public Snack chewingGums() {
        return chewingGums;
    }

    public Snack chips() {
        return chips;
    }

    public Snack chocolates() {
        return chocolates;
    }


}
