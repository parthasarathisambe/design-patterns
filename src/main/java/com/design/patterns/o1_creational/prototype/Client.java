package com.design.patterns.o1_creational.prototype;

public class Client {

  public void generateShapes() {
    Circle originalCircle = new Circle(5);
    originalCircle.display(); // Circle with radius: 10

    Circle clonedCircle = (Circle) originalCircle.clone();
    clonedCircle.display(); // Circle with radius: 10

    Rectangle originalRectangle = new Rectangle(5, 10);
    originalRectangle.display(); // Rectangle with length: 5 and breadth: 10

    Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();
    clonedRectangle.display(); // Rectangle with length: 5 and breadth: 10
  }

}
