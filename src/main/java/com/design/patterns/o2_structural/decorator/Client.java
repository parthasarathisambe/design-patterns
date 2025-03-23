package com.design.patterns.o2_structural.decorator;

public class Client {

  public void makeCustomCoffee() {
    Coffee coffee = new PlainCoffee();
    System.out.println(coffee.make() + " | Cost: " + coffee.cost());

    coffee = new MilkDecorator(coffee); // add milk
    System.out.println(coffee.make() + " | Cost: " + coffee.cost());

    coffee = new SugarDecorator(coffee); // add sugar
    System.out.println(coffee.make() + " | Cost: " + coffee.cost());
  }

}
