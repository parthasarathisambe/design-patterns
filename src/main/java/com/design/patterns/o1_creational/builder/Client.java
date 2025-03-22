package com.design.patterns.o1_creational.builder;

import java.util.List;

public class Client {

  public Pizza generatePizza() {

    return Pizza.builder().size("Large").crust("Soft").toppings(List.of("Pepperoni", "Olives")).build();

  }

}
