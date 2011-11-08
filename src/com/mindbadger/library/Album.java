package com.mindbadger.library;

import java.util.Map;

public class Album extends MediaItem {
  private Map <Integer, Track> tracks;
  
  public Map<Integer, Track> getTracks() {
    return tracks;
  }
  public void setTracks(Map<Integer, Track> tracks) {
    this.tracks = tracks;
  }
}
