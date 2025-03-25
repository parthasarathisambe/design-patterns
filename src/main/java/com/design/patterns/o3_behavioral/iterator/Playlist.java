package com.design.patterns.o3_behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Aggregator<Song> {

  List<Song> songs = new ArrayList<>();

  public void addSong(Song song) {
    songs.add(song);
  }

  @Override
  public Iterator<Song> createIterator() {
    return new PlaylistIterator(songs);
  }

}
