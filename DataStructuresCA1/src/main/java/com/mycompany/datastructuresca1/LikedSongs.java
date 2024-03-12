package com.mycompany.datastructuresca1;

/**
 * 12/03/24
 * LikedSongs.java
 * @author Ryan Stokes
 */

import java.util.Stack;

public class LikedSongs{
    
    public Stack<String> songs;
    private String song;
    
    public LikedSongs(){
        
        songs = new Stack<>();
        song = "";
    }
    
    public void AddLikedSong(String song){
        songs.push(song);
    }
    
    
    
    
}
