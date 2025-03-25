package com.design.patterns.o3_behavioral.strategy;

public class ShoppingCart {

  private PaymentStrategy paymentStrategy;

  public ShoppingCart(PaymentStrategy paymentStrategy) {
    this.paymentStrategy = paymentStrategy;
  }

  public void checkout(int amount) {
    if (paymentStrategy == null) {
      System.out.println("Please select a valid payment method.");
    }
    paymentStrategy.pay(amount);
  }

}
