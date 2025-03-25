package com.design.patterns.o3_behavioral.visitor;

public class Electronic implements CartItem {

  private String brand;

  private double price;

  public Electronic(String brand, double price) {
    this.brand = brand;
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public double accept(CartVisitor visitor) {
    return visitor.visit(this);
  }

}
