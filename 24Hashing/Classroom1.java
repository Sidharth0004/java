import java.util.*;
public class Classroom1 {
    
public static void main(String[] args) {
    HashMap<String ,Integer> hm = new HashMap<>();
    hm.put("India", 100);
    hm.put("China", 150);
    hm.put("US", 50);
    System.out.println(hm);

    // //Get
    // int populationm = hm.get("India");
    // System.out.println(populationm);
    
    // // Contains 
    // System.out.println(hm.containsKey("India"));
    // System.out.println(hm.containsKey("Indonasia"));

    // //remove
    // System.out.println(hm.remove("China"));
    // System.out.println(hm);

    // // size
    // System.out.println(hm.size());

    // //IsEmpty
    // System.out.println(hm.isEmpty());
    // //clear
    // hm.clear();
    // System.out.println(hm.isEmpty());


    // ! Iterate 
// hm.entrySet()
    Set<String>keys = hm.keySet();
    System.out.println(keys);
    for (String k : keys) {
        System.out.println("key = " +k +",Value = "+hm.get(k));
    }
    
}
}
