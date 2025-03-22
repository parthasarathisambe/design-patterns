package com.design.patterns.o1_creational.factory_method;

public class Client {

  public void createDocument() {

    DocumentFactory excelFactory = new ExcelDocumentFactory();
    Document excelDoc = excelFactory.createDocument();
    excelDoc.open();

    DocumentFactory wordFactory = new WordDocumentFactory();
    Document wordDoc = wordFactory.createDocument();
    wordDoc.open();

  }

}
