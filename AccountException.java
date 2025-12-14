package com.skypay.exercice1;

public class AccountException extends RuntimeException {

    public enum Type {
        INVALID_AMOUNT,
        INSUFFICIENT_FUNDS
    }

    private final Type type;

    public AccountException(Type type, String message) {
        super(message);
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
