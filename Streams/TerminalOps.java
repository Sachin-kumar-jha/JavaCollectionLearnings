import java.util.*;
import java.util.stream.Collectors; 

public class TerminalOps {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // 1.collect
        System.out.println(list.stream().skip(1).collect(Collectors.toList()));
        System.out.println(list.stream().skip(1).toList());

        // 2.forEach
        list.stream().forEach(x-> System.out.println(x));

        // 3.reduce
        Optional<Integer>optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        //5. anyMatch , allMatch , noneMatch

      boolean b =  list.stream().anyMatch(x->x%2==0);
      System.out.println(b);

     boolean bool= list.stream().allMatch(x->x>0);
        System.out.println(bool);

    boolean b2 = list.stream().noneMatch(x->x<0);
    System.out.println(b2);

    //6.findFirst ,findAny

    System.out.println(list.stream().findFirst().get());
    System.out.println(list.stream().findAny().get());

    List<String>names = Arrays.asList("Anna","Bob","Charlie","David","Eve");
     names.stream().filter(x->x.length()>5).toList().forEach(System.out::println);

     //Example : Squaring and Sorting Numbers
        List<Integer>numbers = Arrays.asList(5,3,8,1,2);

        System.out.println(numbers.stream().map(x->x*x).sorted().toList()); 

    //Example : Counting Occurences of a Character
    String sentence = "Hello World" ;
    System.out.println(sentence.chars().filter(x->x=='l').count()); 
    
    
    //Statefull & statless operations
    List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    //Stateless operation
    nums.stream().map(x->x*x).forEach(System.out::println);
    System.out.println("-----");
    //Statefull operation
    nums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    //toArray()
   Object[] array = Stream.of(1,2,3).toArray();

    //forEachOrdered
    List<Integer> numbered = Arrays.asList(1,2,3,4,5,6,7);
    System.out.println("using forEach with parrallel stream");
    numbers.parallelStream().forEach(System.out::println);
    numbers.parallelStream().forEachOrdered(System.out::println);
    
    }
}
