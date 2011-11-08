package com.mindbadger.library;

import java.util.Map;

public class Artist extends MediaItem  {
  private Map<String, Album> albums;
  
  public Map<String, Album> getAlbums() {
    return albums;
  }
  public void setAlbums(Map<String, Album> albums) {
    this.albums = albums;
  }
  
}
