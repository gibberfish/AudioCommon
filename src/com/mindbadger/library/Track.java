package com.mindbadger.library;

public class Track extends MediaItem {
  private String fullyQualifiedFileName;
  private int trackNumber;
  private String artist;
  private String album;
  
  public String getFullyQualifiedFileName() {
    return fullyQualifiedFileName;
  }
  public void setFullyQualifiedFileName(String fullyQualifiedFileName) {
    this.fullyQualifiedFileName = fullyQualifiedFileName;
  }
  public void setTrackNumber(int trackNumber) {
    this.trackNumber = trackNumber;
  }
  public int getTrackNumber() {
    return trackNumber;
  }
  public void setArtist(String artist) {
    this.artist = artist;
  }
  public String getArtist() {
    return artist;
  }
  public void setAlbum(String album) {
    this.album = album;
  }
  public String getAlbum() {
    return album;
  }
}
