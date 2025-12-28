
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Function;

class JavaStreamPractice{
    public static void main(String[] args) {


        Predicate<Integer> isEven = x->x % 2 == 0;
        System.out.println(isEven.test(4));
        Predicate<String>isWordStartsWithA = s->s.startsWith("A");
        Predicate<String>isWordEndWithT = s->s.endsWith("t");
        Predicate<Integer> or = Predicate.not(isEven);
        
        System.out.println(or.test(4));
        
        
        Predicate<String> and = isWordStartsWithA.and(isWordEndWithT);
        System.out.println(and.test("Amit"));


        // Function -- > Work For you
        // Consumer --> Work on you
        // Predicate --> Test you
        //Suplier --> Give you



Function<Integer,Integer> doubleIt = x -> x*2;
System.out.println(doubleIt.apply(4));
System.out.println(doubleIt.andThen(x->x*3).apply(3));

Function<Integer,Integer> tripIt = x->x*3;
 int i=doubleIt.compose(tripIt).apply(3);

 Function<Integer,Integer> identity = Function.identity();
Integer res = identity.apply(5) ;

System.out.println(res);


System.out.println(i);
Consumer<String> print = s-> System.out.println(s);
print.accept("Hello World");




Supplier<String> givemeHelloworld = ()->"Hello World from Supplier";
System.out.println(givemeHelloworld.get());
    }
}
