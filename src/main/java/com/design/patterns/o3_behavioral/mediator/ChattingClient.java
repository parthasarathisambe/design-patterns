package com.design.patterns.o3_behavioral.mediator;

public class ChattingClient {

  public void creatingChatRoom() {

    ChatMediator chatRoom = new ChatRoom();

    User user1 = new ChatUser(chatRoom, "user1");
    User user2 = new ChatUser(chatRoom, "user2");
    User user3 = new ChatUser(chatRoom, "user3");

    chatRoom.addUser(user1);
    chatRoom.addUser(user2);
    chatRoom.addUser(user3);

    user1.sendMessage("Hello, everyone");
    // user1 sends: Hello, everyone
    // user2 receives: Hello, everyone
    // user3 receives: Hello, everyone

    user2.sendMessage("Hello Whatsup?");
    // user2 sends: Hello Whatsup?
    // user3 receives: Hello Whatsup?
    // user1 receives: Hello Whatsup?

    user3.sendMessage("Hey guys");
    // user3 sends: Hey guys
    // user1 receives: Hey guys
    // user2 receives: Hey guys

  }

}
