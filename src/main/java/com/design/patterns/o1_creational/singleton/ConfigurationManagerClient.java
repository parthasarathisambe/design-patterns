package com.design.patterns.o1_creational.singleton;

public class ConfigurationManagerClient {

  public void getConfiguration() {
    ConfigurationManager configurationManager1 = ConfigurationManager.getInstance();
    configurationManager1.showConfiguration();
    
    ConfigurationManager configurationManager2 = ConfigurationManager.getInstance();
    configurationManager2.showConfiguration();
  }
  
}
