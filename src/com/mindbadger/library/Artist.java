package com.mindbadger.library;

import java.util.Map;

public class Artist implements Comparable {
  private long id;
  private String name;
  private Map<String, Album> albums;
  
  public long getId() {
    return id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Map<String, Album> getAlbums() {
    return albums;
  }
  public void setAlbums(Map<String, Album> albums) {
    this.albums = albums;
  }
  
  @Override
  public int compareTo(Object o) {
    if (!(o instanceof Artist)) {
      throw new ClassCastException("I'm expecting you to compare me to an Artist");
    }
    
    Artist artistToCompareTo = (Artist) o;
    return this.name.compareTo(artistToCompareTo.getName());
  }
}
