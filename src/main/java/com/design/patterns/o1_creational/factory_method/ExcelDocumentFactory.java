package com.design.patterns.o1_creational.factory_method;

public class ExcelDocumentFactory extends DocumentFactory {

  @Override
  Document createDocument() {
    return new ExcelDocument();
  }

}
