
import java.util.*;

class WeakHashMapDemo{

    public static void main(String[] args){

        WeakHashMap<String,Image> imageCache=new WeakHashMap<>();
// String key1 = new String("img1");
// String key2 = new String("img2");
//        imageCache.put(new String("img1"),new Image("Image 1"));
//        imageCache.put(new String("img2"),new Image("Image 2"));

        loadCache(imageCache);
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (Some entries may be cleared" + imageCache);


    }

    public static void loadCache(Map<String,Image>imageCache){
         String key1 = new String("img1");
         String key2 = new String("img2");
        imageCache.put(key1,new Image("Image 1"));
        imageCache.put(key2,new Image("Image 2"));
    }

    public static void simulateApplicationRunning(){
        try {
            System.out.println("Simulating application running");
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }



}

class Image {

    private String name;

    public Image(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }
}
