package com.design.patterns.o2_structural.proxy;

public class ImageProxy implements Image {

  private String fileName;
  private HighResolutionImage hdImage;

  public ImageProxy(String fileName) {
    this.fileName = fileName;
  }

  @Override
  public void display() {
    if (hdImage == null) {
      hdImage = new HighResolutionImage(fileName);
    }
    hdImage.display();
  }

}
