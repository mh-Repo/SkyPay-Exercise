package com.skypay.exercice1;

import java.time.LocalDate;

public class TestAccount extends Account {
    private LocalDate fixedDate;

    @Override
    protected LocalDate today() {
        return fixedDate != null ? fixedDate : LocalDate.now();
    }

    public void setDate(LocalDate date) {
        this.fixedDate = date;
    }
}
