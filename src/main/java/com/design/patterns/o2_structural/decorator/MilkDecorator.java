package com.design.patterns.o2_structural.decorator;

public class MilkDecorator extends CoffeeDecorator {

  public MilkDecorator(Coffee coffee) {
    super(coffee);
  }

  public String make() {
    return super.make() + " + Milk";
  }

  public double cost() {
    return super.cost() + 10.0;
  }

}
