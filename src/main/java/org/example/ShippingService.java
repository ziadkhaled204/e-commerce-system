package org.example;

import java.util.List;

public class ShippingService {
    public void shippingItems(List<ShippableProduct> items){
      double totalWeight = 0;
      System.out.println("** Shipment notice **");
      for (ShippableProduct item : items){
          double itemWeight = item.getWeight() * item.getQuantity();
          System.out.println("x" + item.getQuantity() + " " + item.getName() +  "     " + itemWeight + "kg");
          totalWeight += itemWeight;
      }
      System.out.println("Total package weight " + totalWeight + "kg");
    }
}
