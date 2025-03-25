package com.design.patterns.o3_behavioral.visitor;

public class Book implements CartItem {

  private String title;

  private double price;

  public Book(String title, double price) {
    this.title = title;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public double accept(CartVisitor visitor) {
    return visitor.visit(this);
  }

}
