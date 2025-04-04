package com.design.patterns.o3_behavioral.interpreter;

public class AdditionExpression implements Expression {

  private Expression leftExpression;
  private Expression rightExpression;

  public AdditionExpression(Expression leftExpression, Expression rightExpression) {
    this.leftExpression = leftExpression;
    this.rightExpression = rightExpression;
  }

  @Override
  public int interpret() {
    return leftExpression.interpret() + rightExpression.interpret();
  }

}
