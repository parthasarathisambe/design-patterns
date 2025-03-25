package com.design.patterns.o3_behavioral.template_method;

public class Client {

  public void prepareBeverage() {

    Beverage tea = new Tea();
    System.out.println("Making tea:");
    tea.prepare();
    // Making tea;
    // Boiling Water.
    // Steeping tea leaves.
    // Pouring into cup.
    // Adding lemon.

    Beverage coffee = new Coffee();
    System.out.println("Making coffee:");
    coffee.prepare();
    // Making coffee:
    // Boiling Water.
    // Brewing coffee grounds.
    // Pouring into cup.
    // Adding sugar and milk.
  }

}
