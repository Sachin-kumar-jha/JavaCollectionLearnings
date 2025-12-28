
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
   ConcurrentSkipListMap<Integer,String> map = new ConcurrentSkipListMap<>();

   map.put(1, "Thread1");
   map.put(2, "Thread2");
   map.put(3, "Thread3");
   System.out.println(map);

    }
}