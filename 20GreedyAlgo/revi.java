import java.util.*;
public class revi {

  public static void main(String[] args) {
    
    Integer coins[]= {1,2,5,10,20,50,100,500,2000} ;
       int amount = 1059;

    Arrays.sort(coins,Collections.reverseOrder());

    ArrayList<Integer> ans = new ArrayList<>();

    int count = 0;

    for (int i = 0; i < coins.length-1; i++) {
      
      if (amount >= coins[i]) {
        
        while (amount>= coins[i]) {
           amount-= coins[i];
           ans.add(coins[i]);
           count++;
        }
      }
    }

    System.out.println("Total min coins used = "+ count);
    for (int i = 0; i < ans.size(); i++) {
     System.out.print(ans.get(i)+" ");
    }
System.out.println( );
  }
  
}