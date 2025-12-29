import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.Arrays;

public class IntermediateOps {
    public static void main(String[] args) {
        //Intermediate Operations transform a stream into another stream 
        //They are Lazy ,meaninng they don't execute until a terminal operation is invoked

        List<String>list = Arrays.asList("Akshit","Ram","Shyam","Ghanshyam","Akshit");

       Stream<String>filteredStream = list.stream().filter(x->x.startsWith("A"));
 //no filtering happens above line as intermediate operations are lazy

 // 1. filter(Predicate)- retains elements that match a given predicate
 
 long ab = filteredStream.count();//terminal operation triggers the filtering
       System.out.println(ab);

// 2. map(Function)-transforms each element using a given function

  Stream<String> stream= list.stream().map(x->x.toUpperCase());
  //System.out.println(stream.toList());

//3. sorted()- sorts the elements of the stream in natural order or using a comparator

    Stream<String>sortedStream = list.stream().sorted();
    System.out.println(Arrays.toString(sortedStream.toArray()));

    Stream<String> sortedwithComparator = list.stream().sorted((a,b)-> b.length()- a.length());
    System.out.println(sortedwithComparator.toList());

//4. distinct()- removes duplicate elements from the stream

Long count = list.stream().filter(x-> x.startsWith("A")).count();
System.out.println(count);

Long counting =list.stream().filter(x->x.startsWith("A")).distinct().count();
System.out.println(counting);

//5. limit(n)- limits the stream to the first n elements

System.out.println(Stream.iterate(1,x->x+1).limit(10).toList());

//6. skip(n)- skips the first n elements of the stream

System.out.println(Stream.iterate(1,x->x+1).skip(5).limit(10).toList());
    }
}
