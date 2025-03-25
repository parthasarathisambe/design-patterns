package com.design.patterns.o3_behavioral.visitor;

public interface CartVisitor {

  double visit(Book book);

  double visit(Electronic electronic);

}
