import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
class CopyonWrite{

    public  static void main(String[] args){

        List<String> sharedList  = new CopyOnWriteArrayList<>();

        sharedList.add("item1");
        sharedList.add("item2");
        sharedList.add("item3");
        sharedList.add("item4");

                Thread readThread = new Thread(()->{
                    try {
                        while(true){
                            for (String item : sharedList) {
                                System.out.println("Reading item "+ item );
                                Thread.sleep(100);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Exception in reader thread");
                    }
                });

        Thread writeThread = new Thread(()->{
            try {
                Thread.sleep(500);
                System.out.println("write thread is called");
                sharedList.add("item4");
            } catch (Exception e) {
                System.out.println("Exception in writer thread");
            }
        });

  readThread.start();
  writeThread.start();
    }
}