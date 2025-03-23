package com.design.patterns.o3_behavioral.chain_of_responsibility;

public class Level1Support extends SupportHandler {

//  public Level1Support() {
//    super();
//  }

  @Override
  public void handleRequest(String issueType) {
    if ("basic".equalsIgnoreCase(issueType)) {
      System.out.println("Level 1 support: Handling basic request...");
    } else if (issueType != null) {
      nextHandler.handleRequest(issueType);
    }
  }

}
