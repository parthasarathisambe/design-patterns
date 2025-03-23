package com.design.patterns.o2_structural.proxy;

public class Client {

  public void usingImageProxy() {
    Image image1 = new ImageProxy("photo1");
    Image image2 = new ImageProxy("photo2");

    image1.display(); // Loading image from disk: photo1.jpg
                      // Displaying: photo1.jpg

    image1.display(); // Displaying: photo1.jpg

    image2.display(); // Loading image from disk: photo2.jpg
                      // Displaying: photo2.jpg
  }

}
