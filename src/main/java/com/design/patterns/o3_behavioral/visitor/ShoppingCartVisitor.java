package com.design.patterns.o3_behavioral.visitor;

public class ShoppingCartVisitor implements CartVisitor {

  @Override
  public double visit(Book book) {
    System.out.println("Book: " + book.getTitle() + " Price: " + book.getPrice());
    return book.getPrice();
  }

  @Override
  public double visit(Electronic electronic) {
    System.out.println("Electronic: " + electronic.getBrand() + " Price: " + electronic.getPrice());
    return electronic.getPrice();
  }

}
