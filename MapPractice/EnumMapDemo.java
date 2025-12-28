
import java.util.*;
class EnumMapDemo {
    public static void main(String[] args) {

        Map<Day,String> map = new EnumMap<Day,String>(Day.class);
        map.put(Day.TUESDAY,"Gym");
        System.out.println(Day.TUESDAY.ordinal());
        map.put(Day.MONDAY,"Walk");

        String s = map.get(Day.TUESDAY);
        System.out.println(s);
        System.out.println(map);
    }


    enum Day{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
    }

}