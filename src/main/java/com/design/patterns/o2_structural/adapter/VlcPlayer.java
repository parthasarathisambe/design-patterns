package com.design.patterns.o2_structural.adapter;

public class VlcPlayer implements AdvanceMediaPlayer {

  @Override
  public void playVlc(String fileName) {
    System.out.println("Playing VLC file: " + fileName);
  }

  @Override
  public void playMp4(String fileName) {
    // do Nothing
  }

}
