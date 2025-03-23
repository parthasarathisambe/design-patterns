package com.design.patterns.o2_structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

  private static Map<String, Shape> circleMap = new HashMap<>();

  public static Shape getCircle(String radius) {
    Shape circle = circleMap.get(radius);

    if (circle == null) {
      circle = new Circle(radius);
      circleMap.put(radius, circle);
      System.out.println("Creating a circle with radius: " + radius);
    }

    return circle;
  }

}
