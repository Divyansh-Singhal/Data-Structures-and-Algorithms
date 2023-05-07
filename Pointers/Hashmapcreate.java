package Pointers;
import java.util.HashMap;

public class Hashmapcreate{
    public static void main(String[] args){
        HashMap<String, Integer>map=new HashMap<>();
        HashMap<String, Integer>map1=new HashMap<>(map);
        map.put("Value",1);
        map1=map;
        System.out.println(map);
        System.out.println(map1);
        //changing value of map
        map.put("Value",2);
        System.out.println(map);
        System.out.println(map1);
        //introducing third map
        HashMap<String, Integer>map2=new HashMap<>(map);
        map2.put("value",3);
        map1=map2;
        map=map2;
        System.out.println(map);
        System.out.println(map1);
        System.out.println(map2);   
    }
}