/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabClass19;



import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

import LabClass19.Movie;


/**
 *
 * @author linhdo
 */
public class TreeMapSorting {
    public static void main(String[] args) {
         Movie m1 = new Movie("The Godfather","Mario Puzo","1006");
         Movie m2 = new Movie("The Dark Knight","Christopher Nolan","1008");
         Movie m3 = new Movie("The Lord of the Rings","J. R. R. Tolkien","1005");
         Movie m4 = new Movie("12 Angry Men","Reginald Rose","1006");
         
         Map<String,Movie> map = new HashMap<>();
         map.put("1006", m1);
         map.put("1008", m2);
         map.put("1005",m3);
         map.put("1006", m4);
         Movie m = map.get("1005");
        System.out.println("Found movie with key 1005: " + m);
        
        //using keyset to get movies by key, but unsorted
          System.out.println("\nUsing a keyset, get the movies by key, unsorted, unordered...");
        Set<String> keys = map.keySet();
        for(String key : keys) {
            Movie found = map.get(key);
            System.out.println(found.toString());
        }
        
        //using keyset to get movies by key and sort them by key
         System.out.println("\nUsing a keyset, get the movie sorted by key (movieID)...");
         Map<String,Movie> map1 = new TreeMap<>(map);
        Set<String> keys2 = map1.keySet();
        for(String key : keys2) {
            Movie found = map.get(key);
            System.out.println(found.toString());
        }
        
         System.out.println("\n Natural order:");
        Collection<Movie> values1 = map1.values();
        // Now put in List because Collections.sort reuquires it...
        List<Movie> sortedList = new ArrayList<>(values1);
        // Now use the utility class to perform the sort using the
        // natural order (Comparable) of the entity object
        Collections.sort(sortedList);
        for(Movie emp : sortedList) {
            System.out.println(emp);
        }
 
        
        // use collection of values to get movies and sort them by author name
        System.out.println("\nUsing a collection of values, get the Movies"
                + " sorted by a Comparator (directorname): ");
        Collection<Movie> values = map1.values();
        // Now put in List
        List<Movie> sortedList1 = new ArrayList<>(values);
        
        Collections.sort(sortedList1, new MovieByAuthorName());
        for(Movie emp : sortedList1) {
            System.out.println(emp);
        }
         
         // use collection of values to get movies and sort them by movie title
        System.out.println("\nUsing a collection of values, get the Movies"
                + " sorted by a Comparator (movie title): ");
        Collection<Movie> values2 = map1.values();
        // Now put in List
        List<Movie> sortedList2 = new ArrayList<>(values2);
        
        Collections.sort(sortedList2, new MovieByTitle());
        for(Movie emp : sortedList2) {
            System.out.println(emp);
      
    }
}
}
