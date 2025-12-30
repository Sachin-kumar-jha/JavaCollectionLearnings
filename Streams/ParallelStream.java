import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    
    public static void main(String[] args) {

        //Allowing multiple threads to process parts of the stream simultaneously
        //This can significantly improve performance for large data sets
        //Workload is distributed across multiple threads 
        long startTime = System.currentTimeMillis();
       List<Integer> list = Stream.iterate(1,x->x+1).limit(2000).toList();
       List<Long> facList= list.stream().map(ParallelStream::factorial).toList();
    //    System.out.println(facList.toString());
       long endTime = System.currentTimeMillis();
       System.out.println("Time taken with stream: " + (endTime-startTime)+ " ms");

      startTime = System.currentTimeMillis();
      facList = list.parallelStream().map(ParallelStream::factorial).toList();
    //   System.out.println(facList.toString());
      endTime=System.currentTimeMillis();
       System.out.println("Time taken with parralel stream: "+ (endTime-startTime)+ " ms");
    }

    // Parallel streams are most effective for CPU-intensive or large datasets where tasks are idependent
   // They may add overhead for simple tasks or small datasets


//Cumulative Sum 
//[1,2,3,4,5] ---> [1,3,6,10,15]


    private static long factorial(int n ){
        long c=0;
       long a =0,b=1;
        for(int i=0;i<=n;i++){
            c= a+b;
            a= b;
            b = c;
        }
        return c;
    }
}
