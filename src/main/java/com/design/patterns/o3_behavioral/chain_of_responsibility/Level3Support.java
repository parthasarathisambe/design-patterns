package com.design.patterns.o3_behavioral.chain_of_responsibility;

public class Level3Support extends SupportHandler {

//  public Level3Support(SupportHandler nextHandler) {
//    super(nextHandler);
//  }

  @Override
  public void handleRequest(String issueType) {
    if ("expert".equalsIgnoreCase(issueType)) {
      System.out.println("Level 3 support: Handling expert request...");
    } else if (issueType != null) {
      System.out.println("No handler available for this issue type.");
    }
  }

}
