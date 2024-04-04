package com.mycompany.datastructuresca1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 04/04/24
 * MusicManagerTest.java
 * @author Ryan Stokes
 */
public class MusicManagerTest {
    
    //Create object of class being tested
    MusicManager mm = new MusicManager();
    
    public MusicManagerTest() {
    }
    
    //Test to check if addLikedSong method correctly concatenates the two strings and inserts into stack
    @Test
    public void testSortLikedSongs() {
        
        String expected = "123 - 123";
        String actual;
        
        mm.addLikedSong("123", "123");
     
        actual = mm.sortLikedSongs();
        
        assertEquals(expected, actual, "sortLikedSongs does not work correctly");
        
    }

    //Test to check if sortGenreA method correctly inserts a song from liked songs into genre A
    @Test
    public void testSortGenreA() {
        
        String expected = "123 - 123";
        String actual;
        
        mm.addLikedSong("123", "123");
        mm.addGenreA();
        
        actual = mm.sortGenreA();
        
        assertEquals(expected, actual, "sortGenreA does not work correctly");
        
    }

    //Test to check if containsA method correctly returns true if a song exists in genre A
    @Test
    public void testContainsA() {
        
        Boolean expected = true;
        Boolean actual;
       
        mm.addLikedSong("123", "123");
        mm.addGenreA();
        
        actual = mm.containsA("123 - 123");
        
        assertEquals(expected, actual, "containsA does not work correctly");
    }

    //Test to check if countA correctly returns the number of songs in genre A as a String
    @Test
    public void testCountA() {
        
        String expected = "3";
        String actual;
        
        mm.addLikedSong("123", "123");
        mm.addLikedSong("124", "124");
        mm.addLikedSong("125", "125");
        
        //Loop which adds the above Strings to a genre playlist
        for(int i = 0; i < 3; i++){
            
            mm.addGenreA();
            
        }
        
        actual = mm.countA();
        
        assertEquals(expected, actual, "countA does not work correctly");
        
    }

    //Test to check if sizeA correctly returns the size of the genre A linked list
    @Test
    public void testSizeA() {
        
        int expected = 5;
        int actual;
        
        mm.addLikedSong("123", "123");
        mm.addLikedSong("124", "124");
        mm.addLikedSong("125", "125");
        mm.addLikedSong("126", "126");
        mm.addLikedSong("127", "127");
        
        //Loop which adds the above Strings to a genre playlist
        for(int i = 0; i < expected; i++){
            
            mm.addGenreA();
            
        }
        
        actual = mm.sizeA();
        
        assertEquals(expected, actual, "sizeA does not work correctly");
        
    }

    //Test to check if iterateA correctly reurns the String at a specified index
    @Test
    public void testIterateA() {
        
        String expected = "125 - 125";
        String actual;
        
        mm.addLikedSong("123", "123");
        mm.addLikedSong("124", "124");
        mm.addLikedSong("125", "125");
        mm.addLikedSong("126", "126");
        mm.addLikedSong("127", "127");
        
        //Loop which adds the above Strings to a genre playlist
        for(int i = 0; i < 5; i++){
            
            mm.addGenreA();
            
        }
        
        actual = mm.iterateA(2);
        
        assertEquals(expected, actual, "iterateA does not work correctly");
        
    }

    //Test to check if addLikedSong method correctly concatenates the two strings and inserts into stack
    @Test
    public void testSortGenreB() {
        
        String expected = "123 - 123";
        String actual;
        
        mm.addLikedSong("123", "123");
        mm.addGenreB();
        
        actual = mm.sortGenreB();
        
        assertEquals(expected, actual, "sortGenreB does not work correctly");
        
    }

    //Test to check if containsA method correctly returns true if a song exists in genre A
    @Test
    public void testContainsB() {
        
        Boolean expected = true;
        Boolean actual;
       
        mm.addLikedSong("123", "123");
        mm.addGenreB();
        
        actual = mm.containsB("123 - 123");
        
        assertEquals(expected, actual, "containsB does not work correctly");
    }

    //Test to check if countA correctly returns the number of songs in genre A as a String
    @Test
    public void testCountB() {
        
        String expected = "3";
        String actual;
        
        mm.addLikedSong("123", "123");
        mm.addLikedSong("124", "124");
        mm.addLikedSong("125", "125");
        
        //Loop which adds the above Strings to a genre playlist
        for(int i = 0; i < 3; i++){
            
            mm.addGenreB();
            
        }
        
        actual = mm.countB();
        
        assertEquals(expected, actual, "countB does not work correctly");
        
    }

    //Test to check if sizeA correctly returns the size of the genre A linked list
    @Test
    public void testSizeB() {
        
        int expected = 5;
        int actual;
        
        mm.addLikedSong("123", "123");
        mm.addLikedSong("124", "124");
        mm.addLikedSong("125", "125");
        mm.addLikedSong("126", "126");
        mm.addLikedSong("127", "127");
        
        //Loop which adds the above Strings to a genre playlist
        for(int i = 0; i < expected; i++){
            
            mm.addGenreB();
            
        }
        
        actual = mm.sizeB();
        
        assertEquals(expected, actual, "sizeB does not work correctly");
        
    }

    //Test to check if iterateA correctly reurns the String at a specified index
    @Test
    public void testIterateB() {
        
        String expected = "125 - 125";
        String actual;
        
        mm.addLikedSong("123", "123");
        mm.addLikedSong("124", "124");
        mm.addLikedSong("125", "125");
        mm.addLikedSong("126", "126");
        mm.addLikedSong("127", "127");
        
        //Loop which adds the above Strings to a genre playlist
        for(int i = 0; i < 5; i++){
            
            mm.addGenreB();
            
        }
        
        actual = mm.iterateB(2);
        
        assertEquals(expected, actual, "iterateB does not work correctly");
        
    }
    
}
