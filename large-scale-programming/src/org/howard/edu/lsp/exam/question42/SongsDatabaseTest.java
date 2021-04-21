package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SongsDatabaseTest {
	
	SongsDatabase db = new SongsDatabase();
	
	@Test
	@DisplayName("Test Case Sample from paper")
	public void testGetGenreOfSong1() {
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		
		String genre = db.getGenreOfSong("Savage");
		
		assertTrue(genre.equals("Rap"));
	};
	
	
	@Test
	@DisplayName("Test Case Sample from paper")
	public void testGetGenreOfSong2() {
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		
		String genre = db.getGenreOfSong("Always There");
		
		assertTrue(genre.equals("Jazz"));
	};
	
	@Test
	@DisplayName("Test Case for getGenreOfSong method on song not in database")
	public void testGetGenreOfSong3() {
		db.addSong("Classical", "Soprano");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Classical", "Sonnet 54");
		
		String genre = db.getGenreOfSong("Ammadaeus");
		
		assertTrue(genre == null);
	};
	
	@Test
	@DisplayName("Test Case Sample from paper")
	public void testGetSongs1() {
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		
		Set<String> songs = db.getSongs("Rap");
		Set<String> compareSet = new HashSet<String>();
		
		compareSet.add("Savage");
		compareSet.add( "Gin and Juice");
		
		assertTrue(songs.containsAll(compareSet));
	};
	
	@Test
	@DisplayName("Test Case Sample for getSongs method on genre not in database")
	public void testGetSongs2() {
		db.addSong("Rap", "Savage");
		db.addSong("Rap", "Gin and Juice");
		db.addSong("Jazz", "Always There");
		
		Set<String> songs = db.getSongs("Classical");
		
		assertTrue(songs == null);
	};
}
