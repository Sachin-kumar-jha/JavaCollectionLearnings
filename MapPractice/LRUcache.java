import java.util.*;
class LRUcahe<K,V> extends LinkedHashMap<K,V>{

private int capacity;
    public LRUcahe(int capacity ) {
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

@Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > capacity;
}

  public  static void main(String[] args) {

        LRUcahe<String,Integer> studentMap=new LRUcahe<>(3);

        studentMap.put("sachin",10);
        studentMap.put("gagan",20);
        studentMap.put("vipin",30);
        studentMap.put("Gautam",40);
        studentMap.put("suresh",50);
        System.out.println(studentMap);
        System.out.println(studentMap.get("sachin"));
        System.out.println(studentMap.get("gagan"));
        System.out.println(studentMap.get("vipin"));


    }
}
