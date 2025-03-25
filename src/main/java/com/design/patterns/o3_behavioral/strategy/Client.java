package com.design.patterns.o3_behavioral.strategy;

public class Client {

  public void shopping() {

    ShoppingCart shoppingCartCc = new ShoppingCart(new CreditCardPayment());
    shoppingCartCc.checkout(1000); // Paid 1000 using Credit Card.

    ShoppingCart shoppingCartPayPal = new ShoppingCart(new PayPalPayment());
    shoppingCartPayPal.checkout(230); // Paid 230 using PayPal.

    ShoppingCart shoppingCartUpi = new ShoppingCart(new UpiPayment());
    shoppingCartUpi.checkout(543); // Paid 543 using UPI.

    ShoppingCart shoppingCartNull = new ShoppingCart(null);
    shoppingCartNull.checkout(3829); // Please select a valid payment method.
  }

}
