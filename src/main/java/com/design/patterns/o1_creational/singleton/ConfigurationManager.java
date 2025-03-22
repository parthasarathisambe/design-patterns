package com.design.patterns.o1_creational.singleton;

public class ConfigurationManager {

  private static ConfigurationManager instance;

  private ConfigurationManager() {
    // private constructor to prevent instantiation
  }
  
  public static ConfigurationManager getInstance() {
    if (instance == null) {
      instance = new ConfigurationManager();
    }
    return instance;
  }

  public void showConfiguration() {
    System.out.println("Displaying Configuration");
  }
  
}
