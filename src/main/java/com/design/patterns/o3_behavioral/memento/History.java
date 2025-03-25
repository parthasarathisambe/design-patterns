package com.design.patterns.o3_behavioral.memento;

import java.util.Stack;

public class History {

  Stack<EditorMemento> mementos = new Stack<>();

  public void save(EditorMemento memento) {
    mementos.push(memento);
  }

  public EditorMemento undo() {
    if (!mementos.isEmpty()) {
      return mementos.pop();
    }
    return null;
  }

}
