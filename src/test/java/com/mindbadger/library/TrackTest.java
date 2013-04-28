package com.mindbadger.library;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrackTest {
	@Test
	public void shouldReturnFilenameOfAlbumArtwork () {
		// Given
		Track track = new Track ();
		track.setFullyQualifiedFileName("C:\\myfolder\\myFile.mp3");
		
		// When
		String artworkFile = track.getArtworkFile();
		
		// Then
		assertEquals ("C:\\myfolder\\AlbumArtSmall.jpg", artworkFile);
	}
}
