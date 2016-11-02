/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabClass19;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author linhdo
 */
public class TreeSetSorting {
    public static void main(String[] args) {
         Movie m1 = new Movie("The Godfather","Mario Puzo","1006");
         Movie m2 = new Movie("The Dark Knight","Christopher Nolan","1008");
         Movie m3 = new Movie("The Lord of the Rings","J. R. R. Tolkien","1005");
         Movie m4 = new Movie("12 Angry Men","Reginald Rose","1006");
         
         // Store them in a TreeSet, which removes dupes and sorts!
        Set<Movie> set = new TreeSet<>();
        set.add(m1);
        set.add(m2);
        set.add(m3);
        set.add(m4);
        
        //use the loop and retreive the movie output
        //duplicate is removed and the movies are sorted
        System.out.println("The size of the Sorted Set is: " + set.size());
        for(Movie m : set) {
            System.out.println(m);
        }
        
        
         
    }
}
