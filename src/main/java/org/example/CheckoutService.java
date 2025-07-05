package org.example;

import java.util.ArrayList;
import java.util.List;

public class CheckoutService {
    public void checkout(Customer customer){
        List<CartItem> cart = customer.getCart();
        if (cart.isEmpty()) throw new IllegalStateException("Cart is empty");

        double subtotal = 0;
        double shipping = 0;
        List<ShippableProduct> shippableItems = new ArrayList<>();

        for (CartItem item : cart) {
            Product product = item.getProduct();
            int qty = item.getQuantity();

            if (!product.isInStock(qty)) throw new IllegalStateException(product.getName() + " is out of stock");

            subtotal += product.getPrice() * qty;

            if (product instanceof ShippableProduct) {
                ShippableProduct shippable = (ShippableProduct) product;
                double weight = shippable.getWeight() * qty;
                shipping += weight * 5; // shipping fees for each product in cart
                shippable.setQuantity(qty);
                shippableItems.add(shippable);
            }
        }

        double total = subtotal + shipping;
        if (customer.getBalance() < total) throw new IllegalStateException("Insufficient balance");

        // editing balance after purchasing
        customer.setBalance(customer.getBalance() - total);

        // removing the quantity taken from the stock
        for (CartItem item : cart) {
            item.getProduct().editQuantity(item.getQuantity());
        }

        // checking for shippable items
        if (!shippableItems.isEmpty()) {
            ShippingService shippingService = new ShippingService();
            shippingService.shippingItems(shippableItems);
        }

        // for printing receipt as provided example
        System.out.println("\n** Checkout receipt **");
        for (CartItem item : cart) {
            System.out.println("x" + item.getQuantity() + " " + item.getProduct().getName() + "     " + item.getTotalPrice());
        }
        System.out.println("----------------------");
        System.out.println("Subtotal " + subtotal);
        System.out.println("Shipping " + shipping);
        System.out.println("Amount " + total);
    }
}
