import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
         Integer arr []={1,2,3,4,5,6,7,8};
        list.addAll(Arrays.asList(arr));
        // for(int i:list){
        //     System.out.println(i);
        // }

        // Iterator<Integer> iterator  = list.iterator();
        // while (iterator.hasNext()) {
        //     System.out.print(iterator.next()+" ");
        // }

        // Iterator<Integer>itr = list.iterator();
        // while (itr.hasNext()) {
        //     Integer number = itr.next();
        //     if(number % 2 == 0){
        //         itr.remove();
        //     }
        // }


        System.out.println(list.toString());

        ListIterator<Integer>listIterator = list.listIterator();
        while (listIterator.hasNext()) {
    listIterator.next();        // Advance the iterator first
    listIterator.set(1);        // Then modify the current element
    System.out.println(listIterator.nextIndex());
}   

        System.out.println(list);
    }
}
