package com.design.patterns.o2_structural.facade;

public class Hotel_Facade {

  private RoomService roomService;
  private CateringService cateringService;
  private TransportationService transportationService;

  public Hotel_Facade() {
    this.roomService = new RoomService();
    this.cateringService = new CateringService();
    this.transportationService = new TransportationService();
  }

  public void bookFullPackage() {
    roomService.bookRoom();
    cateringService.orderFood();
    transportationService.arrangeTransport();
    System.out.println("Full hotel package booked.");
  }

}
