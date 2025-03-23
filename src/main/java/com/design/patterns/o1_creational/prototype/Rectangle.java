package com.design.patterns.o1_creational.prototype;

public class Rectangle implements Shape {

  private int length;
  private int breadth;

  public Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  @Override
  public Shape clone() {
    return new Rectangle(this.length, this.breadth); // deep copy of the object.
  }

  @Override
  public void display() {
    System.out.println("Rectangle with length: " + length + " and breadth: " + breadth);
  }

}
