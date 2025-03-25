package com.design.patterns.o3_behavioral.mediator;

public class Client {

  public void airTrafficControlSystem() {

    AirTrafficControlMediator atcMediator = new AirTrafficControlMediator();

    Aircraft ac1 = new Aircraft("101", atcMediator);
    Aircraft ac2 = new Aircraft("202", atcMediator);
    Aircraft ac3 = new Aircraft("303", atcMediator);

    atcMediator.addColleague(ac1);
    atcMediator.addColleague(ac2);
    atcMediator.addColleague(ac3);

    ac1.sendMessage("Requesting takeoff");
    // Flight 101 sending: Requesting takeoff.
    // Flight 202 received: Requesting takeoff.
    // Flight 303 received: Requesting takeoff.

    ac2.sendMessage("Landing in progress");
    // Flight 202 sending: Landing in progress.
    // Flight 101 received: Landing in progress.
    // Flight 303 received: Landing in progress.

    ac3.sendMessage("Waiting for clearance");
    // Flight 303 sending: Waiting for clearance.
    // Flight 101 received: Waiting for clearance.
    // Flight 202 received: Waiting for clearance.

  }

}
