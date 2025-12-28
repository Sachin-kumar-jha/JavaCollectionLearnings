
import java.util.*;
class ShortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String,Integer> sortedMap = new TreeMap<>();
      // Map<String,Integer> sortedMap = new TreeMap<>();

        sortedMap.put("Vivek",91);
        sortedMap.put("Anil",89);
        sortedMap.put("Gagan",90);
//Shorted on the basis of key

        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap("Gagan"));
        System.out.println(sortedMap.tailMap("Gagan"));


        System.out.println(sortedMap);


    }
}