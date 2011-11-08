package com.mindbadger.library;

public class MediaItem implements Comparable<MediaItem>{
  private int id;
  private String name;

  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  
  @Override
  public int compareTo(MediaItem o) {
    if (!(o instanceof MediaItem)) {
      throw new ClassCastException("I'm expecting you to compare me to an MediaItem");
    }
    
    MediaItem artistToCompareTo = (MediaItem) o;
    return getName().compareTo(artistToCompareTo.getName());
  }
}
