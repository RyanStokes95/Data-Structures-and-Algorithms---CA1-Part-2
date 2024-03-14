package com.mycompany.datastructuresca1;


import java.util.*;
import javax.swing.JOptionPane;

/**
 * 14/03/24
 * LikedSongs.java
 * @author Ryan Stokes
 */

public class MusicManager{
    
    //Data Members
    private final Stack<String> songs;
    private final String song;
    private final String artist;
    private String title;
    private final LinkedList<String> genreA;
    private final LinkedList<String> genreB;
    
    //Class Constructor
    public MusicManager(){
        
        //Stack
        songs = new Stack<>();
        
        artist = "";
        song = "";
        title = "";
        
        //Linked Lists
        genreA = new LinkedList<>();
        genreB = new LinkedList<>();
    }
    
    //Takes inputs form 2 Strings and pushes them into the liked songs stack
    public void addLikedSong(String song, String artist){
        
        title = artist + " - " + song;
        songs.push(title);
        
    }
    
    //Returns the song on the top of the stack, used for sorting into genre playlists
    public String sortLikedSongs(){
        
        return songs.peek();
        
    }
    
    //Adds the song form the top of the stack into the linked list for Rock
    public void addGenreA(){
        
        genreA.add( songs.peek());
        songs.pop();
        
    }
    
    //Used to add the last element of the linked list to list models
    public String sortGenreA(){
        
        return genreA.getLast();
        
    }
    
    //Used in search functionality to check if song is in playlist
    public boolean containsA(String song){
        
        return genreA.contains(song);
    }
    
    //Used to display the number of songs in the playlist
    public String countA(){
        
        return Integer.toString(genreA.size());
        
    }
    
    //Used to remove an element at a specific index in the linked list
    public void deleteA(String song){
        
        genreA.remove(genreA.indexOf(song));
        
    }
    
    //Returns the size of the linked list
    public int sizeA(){
        
        return genreA.size();
        
    }
    
    //Returns the element at a specific index
    public String iterateA(int i){
        
        return genreA.get(i);
        
    }
    
    //Removes a specified element and inserts it in the index below
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
    
    //Removes a specified element and insets it in the index above
    public void moveUpA(String song) {
        int index = genreA.indexOf(song);
        if (index >= 0 && index < genreA.size() - 1) {
            
            genreA.add(index + 2, song);
            genreA.remove(index);
        
        } 
        else {
            
            JOptionPane.showMessageDialog(null, "Song is at Top");
        
        }
    }
    
    //Adds the song form the top of the stack into the linked list for Electronic
    public void addGenreB(){
        
        genreB.add( songs.peek());
        songs.pop();
        
    }
    
    //Used to add the last element of the linked list to list models
    public String sortGenreB(){
        
        return genreB.getLast();
        
    }
    
    //Used in search functionality to check if song is in playlist
    public boolean containsB(String song){
        
        return genreB.contains(song);
    }
    
    //Used to display the number of songs in the playlist
    public String countB(){
        
        return Integer.toString(genreB.size());
        
    }
    
    //Used to remove an element at a specific index in the linked list
    public void deleteB(String song){
        
        genreB.remove(genreB.indexOf(song));
        
    }
    
    //Returns the size of the linked list
    public int sizeB(){
        
        return genreB.size();
        
    }
    
    //Returns the element at a specific index
    public String iterateB(int i){
        
        return genreB.get(i);
        
    }
    
    //Removes a specified element and inserts it in the index below
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
    
    //Removes a specified element and inserts it in the index above
    public void moveUpB(String song) {
        int index = genreB.indexOf(song);
        if (index >= 0 && index < genreB.size() - 1) {
            
            genreB.add(index + 2, song);
            genreB.remove(index);
        
        } 
        else {
            
            JOptionPane.showMessageDialog(null, "Song is at Top");
        
        }
    }
}
