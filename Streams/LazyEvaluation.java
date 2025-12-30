import java.util.List;
import java.util.stream.Stream;
public class LazyEvaluation {
    
    public static void main(String[] args) {
        List<String> list = List.of("Apple", "Banana", "Avocado", "Mango", "Apricot");

        Stream<String> filteredStream = list.stream().filter(name -> {
           System.out.println("Filtering: " + name);
           return name.length()>5;
        });

        System.out.println("No terminal operation invoked yet.");

        List<String> result = filteredStream.toList();
        System.out.println("Terminal operation invoked. Filtered list: " + result); 
    }
}
