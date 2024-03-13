package com.mycompany.datastructuresca1;

/**
 * 12/03/24
 * LikedSongs.java
 * @author Ryan Stokes
 */

import java.util.*;

public class SongSort{
    
    private final Stack<String> songs;
    private final String song;
    private final String artist;
    private String title;
    private final LinkedList<String> genreA;
    private final LinkedList<String> genreB;
    
    public SongSort(){
        
        songs = new Stack<>();
        artist = "";
        song = "";
        title = "";
        genreA = new LinkedList<>();
        genreB = new LinkedList<>();
    }
    
    public void addLikedSong(String song, String artist){
        
        title = artist + " - " + song;
        songs.push(title);
        
    }
    
    public String sortLikedSongs(){
        
        return songs.peek();
        
    }
    
    public void addGenreA(){
        
        genreA.add( songs.peek());
        songs.pop();
        
    }
    
    public String sortGenreA(){
        
        return genreA.getLast();
        
    }
    
    public boolean containsA(String song){
        
        return genreA.contains(song);
    }
    
    public void addGenreB(){
        
        genreB.add( songs.peek());
        songs.pop();
        
    }
    
    public String sortGenreB(){
        
        return genreB.getLast();
        
    }
    
    public boolean containsB(String song){
        
        return genreB.contains(song);
    }
}
