
import java.util.*;
public class Practice {
   public  static void main(String[] args) {
//        HashMap<Integer,String> map = new HashMap<>();
//
//        map.put(9,"subh");
//        map.put(5,"akhsay");
//        map.put(6,"Neha");
//        System.out.println(map);
//
//        String student = map.get(3);
//        System.out.println(student);
//
//        System.out.println(map.containsValue("gagan"));
//
//        Set<Integer> integers = map.keySet();
//
//        for(int i : integers){
//            System.out.println(map.get(i));
//        }
//
//        Set<Map.Entry<Integer,String>> entries = map.entrySet();
//
//        for(Map.Entry<Integer,String> entry : entries){
//            System.out.println(entry.getKey()+" "+entry.getValue().toUpperCase());
//        }
//
//
//        for(Map.Entry<Integer,String> entry : entries){
//            entry.setValue(entry.getValue().toUpperCase());
//        }
//
//        System.out.println(map);




       Map<Person,String> p = new HashMap<>();

       Person p1 = new Person("Sachin",1);
       Person p2 = new Person("kartik",2);
       Person p3 = new Person("Sachin",1);

       p.put(p1,"Engineer"); //Hashcode1 ---> index1
       p.put(p2,"Gamer");    //Hashcode2 ---> index2
       p.put(p3,"Berojgar"); //Hashcode3 ---> index3

       System.out.println("Custom object Map Size"+" "+p.size());

       System.out.println(p.get(p1));
       System.out.println(p.get(p2));
       System.out.println(p.get(p3));

       Map<String,Integer> map= new HashMap<>();
       map.put("Shubham",90); //hashcode -- > index1
       map.put("Neha",92);    //hashcode ---> index2
       map.put("Shubham",99); //hashcode ---> index1 --->equals()-->replace with 99

       System.out.println("Simple map size:"+" " +map.size());

       Student s =new Student();

       LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.5f,true);
       linkedHashMap.putAll(map);
       System.out.println(linkedHashMap.get("shubham"));
       System.out.println(linkedHashMap.get("Neha"));
       System.out.println(linkedHashMap.get("Shubham"));
       //LRU Caching least recently used

       Map<String,Integer> hashmap = new HashMap<>();

       hashmap.put("Shubham",90);
       hashmap.put("Neha",92);
       hashmap.put("gagan",99);

       Integer res  = hashmap.getOrDefault("gagan",0);

       hashmap.putIfAbsent("gagan",0);
       System.out.println(hashmap.get("gagan"));
       System.out.println(res);


    }
}


class Person {
    private String name;

    private int id ;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int id) {
        this.name=name;
        this.id=id;
    }

    @Override
    public boolean equals(Object obj) {
       if(this==obj) return true;

       if(obj== null) return false;

       if(getClass() != obj.getClass()) return false;

        Person other = (Person) obj;

        return id  == other.getId() && Objects.equals(name,other.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}

