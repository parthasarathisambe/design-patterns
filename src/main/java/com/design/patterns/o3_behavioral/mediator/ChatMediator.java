package com.design.patterns.o3_behavioral.mediator;

public interface ChatMediator {

  void sendMessage(String message, User user);
  
  void addUser(User user);
  
}
