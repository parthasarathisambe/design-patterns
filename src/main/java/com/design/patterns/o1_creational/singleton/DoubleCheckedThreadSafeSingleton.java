package com.design.patterns.o1_creational.singleton;

public class DoubleCheckedThreadSafeSingleton {

  private static volatile DoubleCheckedThreadSafeSingleton instance;

  private DoubleCheckedThreadSafeSingleton() {
    // private constructor to prevent instantiation
  }
  
  public static DoubleCheckedThreadSafeSingleton getInstance() {
    if (instance == null) { // first check: no locking
      synchronized (DoubleCheckedThreadSafeSingleton.class) {
        if (instance == null) { // second check: with locking
          instance = new DoubleCheckedThreadSafeSingleton();
        }
      }
    }
    return instance;
  }

}
