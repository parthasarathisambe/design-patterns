package com.design.patterns.o1_creational.factory_method;

public class ExcelDocument extends Document {

  @Override
  public void open() {
    System.out.println("Opening Excel Document...");
  }

}
