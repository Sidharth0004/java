//!                            Indian Coins
import java.util.*;
public class Question5 {
    
    public static void main(String[] args) {
       Integer coins[]= {1,2,5,10,20,50,100,500,2000} ;
    
       Arrays.sort(coins , Comparator.reverseOrder());     // ye call krne ke liye hmari array ko Integer hona pdega
       int amount = 1059;
       int count = 0;
       ArrayList<Integer> ans  =new ArrayList<>();

       for (int i = 0; i < coins.length-1; i++) {
               if (coins[i]<=amount) {
                while (coins[i]<=amount) {
                    amount -= coins[i];
                    ans.add(coins[i]);
                    count++;
                }
               }
       }
       System.out.println("Total min coins used = "+count);
       for (int i = 0; i < ans.size(); i++) {
        System.out.print(ans.get(i)+" ");
       }
System.out.println( );
    }
}
