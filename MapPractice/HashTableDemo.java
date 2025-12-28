import java.util.*;
import java.util.concurrent.*;

class HashTableDemo{
    public static void main(String[] args) {
//        Hashtable<Integer,String> hashTable = new Hashtable<>();
//
//        // Hashtable is synchronized
//        // no null key or value
//        // Legacy Class , Replaced By ConcurrentHashMap
//        // Slower than HashMap
//
//        // only linkedList when collison rather RED BLACK Tree
//
//        hashTable.put(1,"Apple");
//        hashTable.put(2,"Banana");
//        hashTable.put(3,"Cherry");
//
//        System.out.println(hashTable);
//        System.out.println("Value for key 2:"+ hashTable.get(2));
//
// hashTable.remove(1);
//
//        System.out.println(hashTable);
//        //hashTable.put(null,"apple");


        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(i, "Thread1");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(i, "Thread2");
            }
        });

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(map.size());

//
//Map<String,Integer> map1 = new HashMap<>();
//
//map1.put("A",1);
//map1.put("B",2);
//
//Map<String,Integer> map2 = Collections.unmodifiableMap(map1);
////map2.put("C",3); throws Exception
//        System.out.println(map2);
//
//       Map<String,Integer>map3 = Map.of("Shubham", 98, "Vivek", 69);//By default 10
////Here only 10 entries are allowed
//
//       //map3.put("Akshat",88);
//
//      Map<String,Integer> map4 = Map.ofEntries(Map.entry("Akshat",88));
//      map4.put("Akshita",10);
////In map.ofEntries Here we can put multiple entries
//    }
    }
}