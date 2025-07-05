package org.example;

public class ShippableProduct extends Product implements IShippable {
    private double weight;

    public ShippableProduct(String name, double price, int quantity, double weight){
        super(name,price,quantity);
        this.weight=weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
    @Override
    public String getName(){
        return super.getName();
    }
}
