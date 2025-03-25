package com.design.patterns.o3_behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {

  public void visitShoppingCart() {

    List<CartItem> cartItems = new ArrayList<>();
    cartItems.add(new Book("Harry Potter - 1", 200.0));
    cartItems.add(new Electronic("Mobile", 499.0));
    cartItems.add(new Book("Goodwill Hunting", 199.0));
    cartItems.add(new Electronic("Tablet", 999.0));

    CartVisitor visitor = new ShoppingCartVisitor();
    double totalPrice = 0;
    for (CartItem item : cartItems) {
      totalPrice += item.accept(visitor);
    }

    System.out.println("Total price of the items: " + totalPrice);
  }

}
