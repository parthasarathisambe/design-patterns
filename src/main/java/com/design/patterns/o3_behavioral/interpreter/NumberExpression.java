package com.design.patterns.o3_behavioral.interpreter;

public class NumberExpression implements Expression {

  private int number;

  public NumberExpression(int number) {
    this.number = number;
  }

  @Override
  public int interpret() {
    return number;
  }

}
