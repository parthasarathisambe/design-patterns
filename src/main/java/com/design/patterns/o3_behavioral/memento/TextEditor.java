package com.design.patterns.o3_behavioral.memento;

public class TextEditor {

  private String content;

  public void setContent(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  public EditorMemento save() {
    return new EditorMemento(content);
  }

  public void restore(EditorMemento memento) {
    this.content = memento.getContent();
  }

}
