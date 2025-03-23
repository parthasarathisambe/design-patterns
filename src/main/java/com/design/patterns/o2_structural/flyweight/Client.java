package com.design.patterns.o2_structural.flyweight;

public class Client {

  public void generateCircles() {

    Shape circle1 = ShapeFactory.getCircle("5");
    circle1.draw("Red"); // Creating a cirle with radius 5
                         // Drawing a Red circle with radius 5

    Shape circle2 = ShapeFactory.getCircle("5");
    circle2.draw("Blue"); // Drawing a Blue circle with radius 5

    Shape circle3 = ShapeFactory.getCircle("10");
    circle3.draw("Green"); // Creating a cirle with radius 5
                           // Drawing a Red circle with radius 5

  }

}
