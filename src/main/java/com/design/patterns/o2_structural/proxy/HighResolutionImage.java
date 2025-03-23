package com.design.patterns.o2_structural.proxy;

public class HighResolutionImage implements Image {

  private String fileName;

  public HighResolutionImage(String fileName) {
    this.fileName = fileName;
    loadImageFromDisk();
  }

  private void loadImageFromDisk() {
    System.out.println("Loading image from disk: " + fileName);
  }

  @Override
  public void display() {
    System.out.println("Displaying: " + fileName);
  }

}
