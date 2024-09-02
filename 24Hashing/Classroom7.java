                // ! Iterator of HashSet
import java.util.*;
public class Classroom7 {
    
    public static void main(String[] args) {
      HashSet<String>    cities = new HashSet<>();
      cities.add("Delhi");
      cities.add("Mumbai");
      cities.add("Noida");
      cities.add("Bengaluru");

    //   Iterator it = cities.iterator();

    //   while (it.hasNext()) {
    //     System.out.println(it.next()); //? next() is used for both print and update the pointer
    //   }

    // Advanced loop
    for (String city : cities) {
        System.out.println(city);
    }
    }
}
