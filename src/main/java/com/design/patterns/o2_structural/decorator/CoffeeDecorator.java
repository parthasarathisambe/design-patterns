package com.design.patterns.o2_structural.decorator;

public abstract class CoffeeDecorator implements Coffee {

  private Coffee coffee;
  
  public CoffeeDecorator(Coffee coffee) {
    this.coffee = coffee;
  }
  
  public String make() {
    return coffee.make();
  }
  
  public double cost() {
    return coffee.cost();
  }
  
}
