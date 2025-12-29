
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

class JavaStreamPractice{
    /**
     * @param args
     */
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

Function<Integer,Integer> multiply = x->x*10;
Predicate<Integer>greaterThan = x->x>50;
Consumer<Integer> printIt = x->System.out.println(x);
Supplier<Integer> giveMeNumber = ()-> 60;


if(greaterThan.test(giveMeNumber.get())){
    printIt.accept(multiply.apply(giveMeNumber.get()));
 }


 //Bifunction ,BiConsumer , BiPredicate ,BiSupplier


 BiPredicate <Integer,Integer> isSumEven = (x,y)-> (x+y)%2==0;
System.out.println(isSumEven.test(4,6));


BiConsumer<String,Integer> biConsumer = (s,num)-> System.out.println(s+" "+num);
biConsumer.accept("Shubham",90);

BiFunction<String,String,Integer> biFunction = (x,y)-> (x+y).length();
System.out.println(biFunction.apply("Hello ","World"));


//Function<Integer,Integer> function = x-> x*x;
UnaryOperator<Integer> unaryOperator = x-> x+x;
BinaryOperator<Integer>binaryOperator= (x,y)-> x*y;
System.out.println(unaryOperator.apply(5));
System.out.println(binaryOperator.apply(5,6));
 
//Method Refererence -> Tommorow



 List<String> students = Arrays.asList("Ram","Shyam","Mohan");

 students.forEach(x->system.out.println(x));

 //This is Method Reference
 students.forEach(System.out::println);

 

 //Constructor Reference
 List<Student> std = students.stream().map(Student::new).collect(Collectors.toList());



}
}

class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
