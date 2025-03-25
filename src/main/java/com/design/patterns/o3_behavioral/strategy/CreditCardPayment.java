package com.design.patterns.o3_behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {

  @Override
  public void pay(int amount) {
    System.out.println("Paid " + amount + " using Credit Card.");
  }

}
