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
    }
}