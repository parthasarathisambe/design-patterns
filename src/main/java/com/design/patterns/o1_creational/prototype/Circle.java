package com.design.patterns.o1_creational.prototype;

public class Circle implements Shape {

  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public Shape clone() {
    return new Circle(this.radius); // deep copy of the object.
  }

  @Override
  public void display() {
    System.out.println("Circle with radius: " + radius);
  }

}
