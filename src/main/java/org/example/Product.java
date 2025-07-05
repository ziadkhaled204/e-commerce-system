package org.example;

abstract class Product {
    private String name;
    private double price;
    private int quantity;
    private boolean isShippable;
    private boolean hasExpireDate;

    public Product(String name,double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    public void editQuantity(int editedQuantity) {
        this.quantity = editedQuantity;
    }

    public boolean isInStock(int qty) {
        return qty <= this.quantity;
    }
}
