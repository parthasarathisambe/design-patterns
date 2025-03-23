package com.design.patterns.o2_structural.adapter;

public class Client {

  public void play() {
    MediaPlayer vlcPlayer = new MediaAdapter("vlc");
    vlcPlayer.play("vlc", "wedding.vlc");

    MediaPlayer mp4Player = new MediaAdapter("mp4");
    mp4Player.play("mp4", "reception.mp4");
  }

}
