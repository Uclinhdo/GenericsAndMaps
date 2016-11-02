/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabClass19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author linhdo
 */
public class SimpleMapWithGeneric {
    public static void main(String[] args) {
         Movie m1 = new Movie("The Godfather","Mario Puzo","1006");
         Movie m2 = new Movie("The Dark Knight","Christopher Nolan","1008");
         Movie m3 = new Movie("The Lord of the Rings","J. R. R. Tolkien","1005");
         Movie m4 = new Movie("12 Angry Men","Reginald Rose","1006");
         
         Map <String,Movie> map = new HashMap<>();
         map.put("1008", m2);
         map.put("1006", m4);
         
         //retreive it by the key
         Movie m = map.get("1008");
         System.out.println("Retreive movie with movieID key: " + m);
         
          //use the loop to loop through the keys
        System.out.println("\nUsing a keyset, get the Movies...");
        Set<String> keys = map.keySet();
        for(String key : keys) {
            Movie found = map.get(key);
            System.out.println(found.toString());
        }
         //use the loop to loop through the values
        System.out.println("\nUsing a collection of values, get the Movies...");
        Collection <Movie> values = map.values();
        for(Movie emp : values) {
            System.out.println(emp);
        }
    }
    
}
