package org.example;

import java.time.LocalDate;

public class ExpirableIShippableProduct extends ExpirableProduct implements IShippable {

    private double weight;

    public ExpirableIShippableProduct(String name, double price, int quantity, LocalDate expiryDate, double weight){
        super(name,price,quantity,expiryDate);
        this.weight = weight;
    }

    @Override
    public String getName(){
        return super.getName();
    }
    @Override
    public double getWeight(){
        return weight;
    }
}
