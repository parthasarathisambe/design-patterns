package com.design.patterns.o3_behavioral.memento;

public class Client {

  public void textEditor() {

    TextEditor editor = new TextEditor();
    History history = new History();

    editor.setContent("Hello");
    history.save(editor.save());
    System.out.println("Content: " + editor.getContent()); // Content: Hello

    editor.setContent("Hello World!");
    history.save(editor.save());
    System.out.println("Content: " + editor.getContent()); // Content: Hello World!

    editor.setContent("Hello Design patterns!");
    System.out.println("Content: " + editor.getContent()); // Content: Hello Design patterns!

    editor.restore(history.undo());
    System.out.println("Content: " + editor.getContent()); // Content: Hello World!

    editor.restore(history.undo());
    System.out.println("Content: " + editor.getContent()); // Content: Hello
  }

}
