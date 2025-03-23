package com.design.patterns.o3_behavioral.chain_of_responsibility;

public class Level2Support extends SupportHandler {

//  public Level2Support() {
//    super();
//  }

  @Override
  public void handleRequest(String issueType) {
    if ("technical".equalsIgnoreCase(issueType)) {
      System.out.println("Level 2 support: Handling technical request...");
    } else if (issueType != null) {
      nextHandler.handleRequest(issueType);
    }
  }

}
