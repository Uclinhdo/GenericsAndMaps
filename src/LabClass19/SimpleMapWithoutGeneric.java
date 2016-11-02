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
public class SimpleMapWithoutGeneric {
    public static void main(String[] args) {
         Movie m1 = new Movie("The Godfather","Mario Puzo","1006");
         Movie m2 = new Movie("The Dark Knight","Christopher Nolan","1008");
         Movie m3 = new Movie("The Lord of the Rings","J. R. R. Tolkien","1005");
         Movie m4 = new Movie("12 Angry Men","Reginald Rose","1006");
    
        Map map = new HashMap();
        map.put("1006",m1);
        map.put("1008", m2);
        
        //retreive it by the key
        Movie m = (Movie)map.get("1008");
        System.out.println("Retreive movie with movieID key:  \n" + m );
        
        //use the loop to loop through the keys
        System.out.println("\nUsing a keyset, get the Movies...");
        Set keys = map.keySet();
        for(Object key : keys) {
            Movie found = (Movie)map.get(key);
            System.out.println(found.toString());
        }
        
        //use the loop to loop through the values
        System.out.println("\nUsing a collection of values, get the Movies...");
        Collection values = map.values();
        for(Object emp : values) {
            System.out.println((Movie)emp);
        }
    
    }
   
    
    
    
}
