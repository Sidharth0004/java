import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);                                    // Time Complexity 0(n) 
        list.add(3);
        list.add(6);
        System.out.println(list+" ");
        Collections.sort(list);          //ascending
        System.out.println(list+" ");
        
        //descending
        Collections.sort(list, Collections.reverseOrder());
        // Comparator - Fnx Logic
        System.out.println(list+" "); 
    }
}
