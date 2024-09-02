                                //! LinkedHashMap && TreeMap
import java.util.*;
public class Classroom3 {
   
    
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
         lhm.put("India", 100);
         lhm.put("China", 150);
         lhm.put("US", 50);
         System.out.println(lhm);


        TreeMap<String, Integer> thm = new TreeMap<>();
         thm.put("India", 100);
         thm.put("China", 150);
         thm.put("US", 50);
         System.out.println(thm);
    }
}
