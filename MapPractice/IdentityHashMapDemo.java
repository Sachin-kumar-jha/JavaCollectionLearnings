
import java.util.*;


class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("key");
        String key2 = new String("key");

        Map<String ,Integer> map = new IdentityHashMap<>();
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));

        System.out.println(key1.hashCode());
        System.out.println(key2.hashCode());
        map.put(key1,1);
        map.put(key2,2);

        // hashcode and equals
        // Identity Hashmap only Object Class HashCode is used always
        //Identity hashcode and == operator in the place of equals method



        System.out.println(key1==key2);

        System.out.println(map);
    }
}