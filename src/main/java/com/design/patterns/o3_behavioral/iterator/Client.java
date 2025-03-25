package com.design.patterns.o3_behavioral.iterator;

public class Client {

  public void createPlaylistIterator() {

    Playlist playlist = new Playlist();

    playlist.addSong(new Song("song 1"));
    playlist.addSong(new Song("song 2"));
    playlist.addSong(new Song("song 3"));

    Iterator<Song> playlistIterator = playlist.createIterator();
    System.out.println("Playlist:");
    while (playlistIterator.hasNext()) {
      Song song = playlistIterator.next();
      System.out.println(song.getTitle());
    }

  }

}
