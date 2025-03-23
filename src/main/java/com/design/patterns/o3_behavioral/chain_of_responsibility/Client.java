package com.design.patterns.o3_behavioral.chain_of_responsibility;

public class Client {

  public void customerSupport() {
    // create handlers with names
    SupportHandler level1 = new Level1Support();
    SupportHandler level2 = new Level2Support();
    SupportHandler level3 = new Level3Support();

    // building chain of responsibility
    level1.setNextHandler(level2);
    level2.setNextHandler(level3);

    level1.handleRequest("basic"); // Level 1 support: Handling basic request...
    level1.handleRequest("technical"); // Level 2 support: Handling technical request...
    level1.handleRequest("expert"); // Level 3 support: Handling expert request...
    level1.handleRequest("pro"); // No handler available for this issue type.
  }

}
