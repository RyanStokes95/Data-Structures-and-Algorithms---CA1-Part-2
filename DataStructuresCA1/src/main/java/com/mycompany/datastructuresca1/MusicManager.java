package com.mycompany.datastructuresca1;

/**
 * 14/03/24
 * LikedSongs.java
 * @author Ryan Stokes
 */

import java.util.*;
import javax.swing.JOptionPane;

public class MusicManager{
    
    private final Stack<String> songs;
    private final String song;
    private final String artist;
    private String title;
    private final LinkedList<String> genreA;
    private final LinkedList<String> genreB;
    
    public MusicManager(){
        
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
    
    public String countA(){
        
        return Integer.toString(genreA.size());
        
    }
    
    public void deleteA(String song){
        
        genreA.remove(genreA.indexOf(song));
        
    }
    
    public int sizeA(){
        
        return genreA.size();
        
    }
    
    public String iterateA(int i){
        
        return genreA.get(i);
        
    }
    
    public void moveDownA(String song) {
        int index = genreA.indexOf(song);
        if (index >= 0 && index > 0){
            
            genreA.add(index - 1, song);
            genreA.remove(index + 1);
            
        } 
        else {
            
        JOptionPane.showMessageDialog(null, "Song is at Bottom");
        
        }
    }
    
    public void moveUpA(String song) {
        int index = genreA.indexOf(song);
        if (index >= 0 && index < genreA.size() - 1) { // Check if the song exists and is not already at the bottom
            
            genreA.add(index + 2, song); // Move the song down by adding it after the next element
            genreA.remove(index); // Remove the duplicate song from its original position after moving it
        
        } 
        else {
            
            JOptionPane.showMessageDialog(null, "Song is at Top");
        
        }
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
    
    public String countB(){
        
        return Integer.toString(genreB.size());
        
    }
    
    public void deleteB(String song){
        
        genreB.remove(genreB.indexOf(song));
        
    }
    
    public int sizeB(){
        
        return genreB.size();
        
    }
    
    public String iterateB(int i){
        
        return genreB.get(i);
        
    }
    
    public void moveDownB(String song) {
        int index = genreB.indexOf(song);
        if (index >= 0 && index > 0){
            
            genreB.add(index - 1, song);
            genreB.remove(index + 1);
            
        } 
        else {
            
        JOptionPane.showMessageDialog(null, "Song is at Bottom");
        
        }
    }
    
    public void moveUpB(String song) {
        int index = genreB.indexOf(song);
        if (index >= 0 && index < genreB.size() - 1) { // Check if the song exists and is not already at the bottom
            
            genreB.add(index + 2, song); // Move the song down by adding it after the next element
            genreB.remove(index); // Remove the duplicate song from its original position after moving it
        
        } 
        else {
            
            JOptionPane.showMessageDialog(null, "Song is at Top");
        
        }
    }
}
