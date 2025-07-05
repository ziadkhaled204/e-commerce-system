package org.example;

import java.time.LocalDate;

public class ExpirableProduct extends Product implements IExpirable {
    private LocalDate expiryDate;
    public ExpirableProduct(String name, double price, int quantity, LocalDate expiryDate) {
        super(name, price, quantity);
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean expirable() {
        return false;
    }
}
