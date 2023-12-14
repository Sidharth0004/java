import java.util.ArrayList;
//import java.util.*;                    // Ye sub kuch ko import krta hai
public class syntax {
   public static void main(String[] args) {
    //Java Collectin Framework
    ArrayList<Integer> list = new ArrayList<>();
     ArrayList<String> list2 = new ArrayList<>();
      ArrayList<Boolean> list3 = new ArrayList<>();
       
              /// Add element
      list.add(1);
      list.add(2);
      list.add(3);
      list.add(4);
      System.out.println(list);
  
               // To add element at Specific Index
           list.add(1,9);
           System.out.println(list);

              // Get Element
      int element = list.get(2);
      System.out.println(element);

           // Remove Element 
             list.remove(2);
             System.out.println(list);

             //Set Opt
             list.set(2, 10);
             System.out.println(list);

             //Contains Element
          System.out.println(list.contains(1));   
          System.out.println(list.contains(3));


   } 
}
