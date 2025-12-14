package com.skypay.exercice1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class Account {

    private final List<Transaction> transactions = new ArrayList<>();
    private int balance = 0;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    protected LocalDate today() {
        return LocalDate.now();
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new AccountException(
                AccountException.Type.INVALID_AMOUNT,
                "Deposit amount must be positive"
            );
        }
        balance += amount;
        transactions.add(new Transaction(today(), amount, balance));
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new AccountException(
                AccountException.Type.INVALID_AMOUNT,
                "Withdraw amount must be positive"
            );
        }
        if (balance < amount) {
            throw new AccountException(
                AccountException.Type.INSUFFICIENT_FUNDS,
                "Insufficient balance"
            );
        }
        balance -= amount;
        transactions.add(new Transaction(today(), -amount, balance));
    }

    public void printStatement() {
        System.out.println("DATE | AMOUNT | BALANCE");
        for (Transaction t : transactions) {
            System.out.println(
                t.getDate().format(formatter)
                + " | " + t.getAmount()
                + " | " + t.getBalanceAfter()
            );
        }
    }

}
