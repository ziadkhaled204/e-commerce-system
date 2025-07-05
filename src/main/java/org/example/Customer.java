package org.example;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private double balance;
    private List<CartItem> cart = new ArrayList<>();

    public Customer(String name, double balance) {
        this.name    = name;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
    public void addToCart(CartItem item){
        cart.add(item);
    }
    public List<CartItem> getCart(){
        return cart;
    }
}
