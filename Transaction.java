package com.skypay.exercice1;

import java.util.ArrayList;
import java.time.LocalDate;
import com.skypay.exercice1.Transaction;

public class Transaction {
    private final LocalDate date;
    private final int amount;
    private final int balanceAfter;

    public Transaction(LocalDate date, int amount, int balanceAfter) {
        this.date = date;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public int getBalanceAfter() {
        return balanceAfter;
    }
}
