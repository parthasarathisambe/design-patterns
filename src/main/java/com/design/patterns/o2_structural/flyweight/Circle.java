package com.design.patterns.o2_structural.flyweight;

public class Circle implements Shape {

  private String radius;

  public Circle(String radius) {
    this.radius = radius;
  }

  @Override
  public void draw(String color) {
    System.out.println("Drawing a " + color + " circle with radius " + radius);
  }

}
