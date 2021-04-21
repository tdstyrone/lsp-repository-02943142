package org.howard.edu.lsp.exam.question42;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
	
	private Map<String, Set<String>> map = new HashMap<String, Set<String>>();
				
	/* Add a song title to a genre */
	public void addSong(String genre, String songTitle) {
		//Code it!!
		if (!map.containsKey(genre)) {
			Set<String> songs = new HashSet<String>();
			songs.add(songTitle);
			map.put(genre, songs);
		} else {
			Set<String> songs = map.get(genre);
			if (songs == null) {
				songs = new HashSet<String>();
				songs.add(songTitle);
				map.put(genre, songs);
			} else {
				songs.add(songTitle);
			};
		};
		
	};
   
    
    /* Return the Set that contains all songs for a genre */
    public Set<String> getSongs(String genre) {
    	// Code it!!
    	if (map.containsKey(genre)) {
    		Set<String> songs = map.get(genre);
    		return songs;
    	} else {
    		return null;
    	}
    	
    	
	};

	
	/* Return genre, i.e., jazz, given a song title */
	public String getGenreOfSong(String songTitle) {
		// Code it!!
		for (Map.Entry<String, Set<String>> mapElement : map.entrySet()) {
			String key = (String)mapElement.getKey();
			
			Set<String> songs = (Set<String>)mapElement.getValue();
			
			if (songs.contains(songTitle)) {
				return key;
			}
		}
		return null;
		
	};

};
