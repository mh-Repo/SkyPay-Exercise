package com.skypay.exercice1;

import java.util.*;
import java.time.LocalDate;

public class Main {

public static void main(String[] args) {

    System.out.println("=== DEMO BANKING SERVICE ===");

    try {
        TestAccount account = new TestAccount();

        account.setDate(LocalDate.of(2025, 1, 10));
        account.deposit(1000);

        account.setDate(LocalDate.of(2025, 1, 13));
        account.deposit(2000);

        account.setDate(LocalDate.of(2025, 1, 14));
        account.withdraw(500);

        account.setDate(LocalDate.of(2025, 5, 23));
        account.withdraw(200);

        account.setDate(LocalDate.of(2015, 9, 21));
        account.withdraw(100);

        System.out.println("--- BANK STATEMENT ---");
        account.printStatement();

    } catch (AccountException e) {
        switch (e.getType()) {
            case INVALID_AMOUNT:
                System.err.println("Input error: " + e.getMessage());
                break;
            case INSUFFICIENT_FUNDS:
                System.err.println("Business error: " + e.getMessage());
                break;
        }
    }

        System.out.println("=== END ===");
    }
}