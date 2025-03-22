package com.design.patterns.o1_creational.singleton;

public class ThreadSafeSingleton {

  private static ThreadSafeSingleton instance;

  private ThreadSafeSingleton() {
    // private constructor to prevent instantiation
  }
  
  public static synchronized ThreadSafeSingleton getInstance() {
    if (instance == null) {
      instance = new ThreadSafeSingleton();
    }
    return instance;
  }

  public void print() {
    System.out.println("This is from Thread Safe singleton class");
  }

}
