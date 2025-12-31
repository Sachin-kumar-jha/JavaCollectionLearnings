import java.util.Iterator;
import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
         Integer arr []={1,2,3,4,5,6,7,8};
        list.addAll(Arrays.asList(arr));
        // for(int i:list){
        //     System.out.println(i);
        // }

        Iterator<Integer> iterator  = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
    }
}
