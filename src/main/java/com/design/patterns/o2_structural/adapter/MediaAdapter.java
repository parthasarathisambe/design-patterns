package com.design.patterns.o2_structural.adapter;

public class MediaAdapter implements MediaPlayer {

  private AdvanceMediaPlayer advanceMediaPlayer;

  public MediaAdapter(String audioType) {
    if ("vlc".equalsIgnoreCase(audioType)) {
      advanceMediaPlayer = new VlcPlayer();
    } else if ("mp4".equalsIgnoreCase(audioType)) {
      advanceMediaPlayer = new Mp4Player();
    }
  }

  @Override
  public void play(String audioType, String fileName) {
    if ("vlc".equalsIgnoreCase(audioType)) {
      advanceMediaPlayer.playVlc(fileName);
    } else if ("mp4".equalsIgnoreCase(audioType)) {
      advanceMediaPlayer.playMp4(fileName);
    }
  }

}
