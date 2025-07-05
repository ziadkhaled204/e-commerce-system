// Main.java
package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            // Create products
            Product cheese = new ShippableProduct("Cheese", 100, 2, 0.5);
            Product biscuits = new ShippableProduct("Biscuits", 150, 1, 0.6);
            Product scratchCard = new Product("Mobile Scratch Card", 5, 5) {};

            // Create customer
            Customer customer = new Customer("Ziad", 500);

            // Add to cart
            customer.addToCart(new CartItem(cheese, 2));
            customer.addToCart(new CartItem(biscuits, 1));
            customer.addToCart(new CartItem(scratchCard, 3));

            // inject logic from checkoutService
            CheckoutService checkoutService = new CheckoutService();

            checkoutService.checkout(customer);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
