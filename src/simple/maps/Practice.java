/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author linhdo
 */
public class Practice {
    public static void main(String[] args) {
        //not using gneric
//        Map map1 = new HashMap();
//        map1.put("Chevy", "Corvette");
//        map1.put("Ford","Ford GT");
//        map1.put("Dodge", "Challenger");
//        
//        
//        //retrieve objects and using casting
//        String fav = (String) map1.get("Ford");
//        System.out.println(fav);
//        
        
        //using generic
//        Map<String,List<String>> map2 = new HashMap<>();
//        
//        List<String> chevyList = new ArrayList<>();
//        chevyList.add("Corvette");
//        chevyList.add("Camero");
//        
//        List<String> fordList = new ArrayList<>();
//        fordList.add("Ford GT");
//        fordList.add("Mustang");
//        
//        map2.put("Chevy", chevyList);
//        map2.put("Ford",fordList);
//       
//        
//        
//        
//        //retrieve objects and using casting.
//        List<String> fav1 = map2.get("Ford");
//        System.out.println(fav1);
//        
//        //looping in map to get the key objects.
//        System.out.println("Outputting keys:");
//        Set<String> keys = map2.keySet();
//        for(String key : keys){
//            System.out.println(key);
//        }
//        
//        System.out.println("Outputting values:");
//       Collection <List<String>> values = map2.values();
//        for(List<String> value : values){
//            System.out.println(value);
//        }
        Map<String, Object> record1 = new HashMap<>();
        record1.put("id", "1");
        record1.put("lastname", "Do");
        record1.put("age",new Integer(26));
        
        
        List<Map<String, Object>> records = new ArrayList<>();
        records.add(record1);
        
        
        
    }
    
}
