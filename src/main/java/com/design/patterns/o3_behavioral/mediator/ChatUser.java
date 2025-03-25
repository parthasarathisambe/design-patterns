package com.design.patterns.o3_behavioral.mediator;

public class ChatUser extends User {

  public ChatUser(ChatMediator chatMediator, String name) {
    super(chatMediator, name);
  }

  @Override
  void sendMessage(String message) {
    System.out.println(name + " sends :" + message);
    chatMediator.sendMessage(message, this);
  }

  @Override
  void receiveMessage(String message) {
    System.out.println(name + "receives: " + message);
  }

}
