package com.mycompany.datastructuresca1;

/**
 * 12/03/24
 * LikedSongs.java
 * @author Ryan Stokes
 */

import java.util.*;

public class SongSort{
    
    private Stack<String> songs;
    private String song;
    private String artist;
    private String title;
    private ArrayList<String> genreA;
    private ArrayList<String> genreB;
    
    public SongSort(){
        
        songs = new Stack<>();
        artist = "";
        song = "";
        title = "";
        genreA = new ArrayList<>();
        genreB = new ArrayList<>();
    }
    
    public void addLikedSong(String song, String artist){
        
        title = artist + " - " + song;
        songs.push(title);
        
    }
    
    public String sortLikedSongs(){
        
        return songs.peek();
        
    }
    
    public void addGenreA(){
        
        genreA.add(songs.peek());
        songs.pop();
        
    }
    
    public String sortGenreA(){
        
        return genreA.getLast();
        
    }
    
    public void addGenreB(){
        
        genreB.add(songs.peek());
        songs.pop();
        
    }
    
    public String sortGenreB(){
        
        return genreB.getLast();
        
    }
}
