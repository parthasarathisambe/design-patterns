package com.design.patterns.o2_structural.adapter;

public class Mp4Player implements AdvanceMediaPlayer {

  @Override
  public void playVlc(String fileName) {
    // do Nothing
  }

  @Override
  public void playMp4(String fileName) {
    System.out.println("Playing Mp4 file: " + fileName);
  }

}
