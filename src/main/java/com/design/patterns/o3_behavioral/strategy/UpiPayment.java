package com.design.patterns.o3_behavioral.strategy;

public class UpiPayment implements PaymentStrategy {

  @Override
  public void pay(int amount) {
    System.out.println("Paid " + amount + " using UPI.");
  }

}
