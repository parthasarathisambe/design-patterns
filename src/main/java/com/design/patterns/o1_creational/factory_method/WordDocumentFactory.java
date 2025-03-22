package com.design.patterns.o1_creational.factory_method;

public class WordDocumentFactory extends DocumentFactory {

  @Override
  Document createDocument() {
    return new WordDocument();
  }

}
