import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorDemo {
     public static void main(String[] args) {
        //Collectors is a utility class
        //provides a set of methods to create common collectors

        List<String> names = Arrays.asList("Alice","Bob","Charlie");

        //1. Collecting to a List
        List<String>res=names.stream().filter(name -> name.startsWith("A"))
        .collect(Collectors.toList());

        System.out.println(res);


        // 2. Collecting to Set
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        nums.stream().collect(Collectors.toSet());

        //3. Collecting to a Specified Collection
       ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(()->new ArrayDeque<>()));

        //4. Joining Strings
       String conactedString =   names.stream().map(String::toUpperCase).collect(Collectors.joining(","));
 System.out.println(conactedString+" ");

       //5. Summarizing Data
       //Generates stastical summary (count,sum,min,average,max)
    List<Integer> numbers = Arrays.asList(2,3,5,7,11);

    IntSummaryStatistics statis =  numbers.stream().collect(Collectors.summarizingInt(x->x));

    System.out.println(statis.getCount());
    System.out.println(statis.getSum());
    System.out.println(statis.getMin());
    System.out.println(statis.getAverage());
    System.out.println(statis.getMax());


    //6. Calculating Averages
    Double collect1 = numbers.stream().collect(Collectors.averagingDouble(x->x));
    System.out.println("Average: " + collect1);

    //7. Counting Elements
   Long count =  numbers.stream().collect(Collectors.counting());
   System.out.println("Count:"+count);
  

   //8. Grouping Elements 

   List<String>words = Arrays.asList("hello","world","java","streams","collecting");
   //System.out.println(words.stream().collect(Collectors.groupingBy(x->x.length())));  
   //with method reference
   System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));

   System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.joining(", "))));

   System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.counting())));

   TreeMap<Integer,Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length,TreeMap::new,Collectors.counting()));
   System.out.println(treeMap);

   //9. Partitioning Elements

   // Partitions elements into two groups(true and false) based on a predicate
   System.out.println(words.stream().collect(Collectors.partitioningBy(x->x.length()>5)));

   // 10. Mapping and Collecting
  // Applies a mapping function before collecting
 System.out.println(words.stream().collect(Collectors.mapping(x->x.toUpperCase(),Collectors.toList())));
  

 //Example 1 : Collecting Name by length
  
 List<String> l1 = Arrays.asList("Anna","Bob","Alexander","Brian","Alice");
  System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));

  //Example 2 : Counting Word Occurences
  String sentence = "hello world hello java world";
  Map<String, Long> wordCount = Arrays.stream(sentence.split(" "))
    .collect(Collectors.groupingBy(x -> x, Collectors.counting()));   
 System.out.println(wordCount);


 //Example 3 : Partitioning Even and Odd Numbers 

 List<Integer> l2 = Arrays.asList(1,2,3,4,5,6);
System.out.println(l2.stream().collect(Collectors.partitioningBy(x->x%2==0))); 


//Example 4 : Summing Values in a Map 

Map<String ,Integer> items = new HashMap<>();
items.put("Apple",10);
items.put("Banana",20);
items.put("Orange",15);

System.out.println(items.values().stream().reduce(Integer::sum));

System.out.println(items.values().stream().collect(Collectors.summingInt(x->x)));

//Example 5 : Creating a Map from Stream Elements 
List<String>fruits = Arrays.asList("Apple","Banana","Cherry");

Map<String,Integer> fruitemap = fruits.stream().collect(Collectors.toMap(x->x.toUpperCase(),x->x.length()));
System.out.println(fruitemap);

// Example 6:
List<String> words2 = Arrays.asList("apple","banana","apple","orange","banana","apple"); 

//words2.stream().collect(Collectors.toMap(k->k,v->1,(x,y)->x+y));
Map<String,Integer> worMap= words2.stream().collect(Collectors.toMap(k->k,v->1,(x,y)->x+y));
//System.out.println(words2.stream().collect(Collectors.toMap(k->k,v->1,(x,y)->x+y)));
System.out.println(worMap);
     }
}
