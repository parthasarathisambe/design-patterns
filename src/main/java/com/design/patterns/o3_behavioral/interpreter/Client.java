package com.design.patterns.o3_behavioral.interpreter;

public class Client {

  public void mathematicalExpressions() {

    // Build the expression (5 + 3) - 2
    Expression ex1 = new NumberExpression(5);
    Expression ex2 = new NumberExpression(3);
    Expression ex3 = new NumberExpression(2);

    // (5 + 3)
    Expression addition = new AdditionExpression(ex1, ex2);

    // (5 + 3) - 2
    Expression subtraction = new SubtractionExpression(addition, ex3);

    System.out.println("Result: " + subtraction.interpret()); // Result: 6
  }

}
