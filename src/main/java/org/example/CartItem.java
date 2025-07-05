package org.example;

public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product p,int q){
        this.product=p;
        this.quantity=q;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice(){
        return product.getPrice() * quantity;
    }
}
