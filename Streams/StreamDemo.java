import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    
    public static void main(String[] args) {
       
        //Feature introduced in Java 8
        //process collections of data in a functional and declarative manner
        //Simplify Data Processing 
        //Embrace Functional Programming
        //Improve Readability and Maintainability
        //Enable Parallelism 

        //How to Use Streams ?
        //Source --> Intermediate Operations --> Terminal Operations
 List<Integer>numbers = Arrays.asList(1,2,3,4,5,6);

  List<Integer> nums = numbers.stream().filter(x->x%2==0).toList();
  System.out.println(nums);

  //Creating Streams

  // 1.From collections

  String [] array = {"a","b","c"};
  
  //2.From Arrays
  Stream<String> stream = Arrays.stream(array);
  
  //3.Using Stream.of()

   Stream<String> stream2 = Stream.of("a","b","c");


   // 4. Infinite streams
   Stream.generate(()->1);

   //5.Limit (finite stream)
   Stream.generate(()->1).limit(10);

   //6.Iterate(infinite stream)

   Stream<Integer> generate = Stream.iterate(1,x->x+1);
   System.out.println(generate.limit(10).toList());
   
    }
}
