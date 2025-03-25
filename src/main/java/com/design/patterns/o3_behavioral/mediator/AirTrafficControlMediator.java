package com.design.patterns.o3_behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficControlMediator implements Mediator {

  private List<Colleague> colleagues = new ArrayList<>();
  
  public void addColleague(Colleague colleague) {
    colleagues.add(colleague);
  }
  
  @Override
  public void sendMessage(String message, Colleague sender) {
    for (Colleague colleague: colleagues) {
      if (colleague != sender) {
        colleague.receiveMessage(message);
      }
    }
  }

}
