package com.design.patterns.o3_behavioral.iterator;

import java.util.List;

public class PlaylistIterator implements Iterator<Song> {

  private List<Song> songs;
  private int position;

  public PlaylistIterator(List<Song> songs) {
    this.songs = songs;
  }

  @Override
  public boolean hasNext() {
    return position < songs.size();
  }

  @Override
  public Song next() {
    if (hasNext()) {
      return songs.get(position++);
    }
    return null;
  }

}
