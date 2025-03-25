package com.design.patterns.o3_behavioral.visitor;

public interface CartItem {

  double accept(CartVisitor visitor);

}
