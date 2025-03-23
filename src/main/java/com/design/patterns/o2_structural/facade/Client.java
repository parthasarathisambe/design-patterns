package com.design.patterns.o2_structural.facade;

public class Client {

  public void bookFullPackage() {
    Hotel_Facade hotel = new Hotel_Facade();
    hotel.bookFullPackage();
  }

}
