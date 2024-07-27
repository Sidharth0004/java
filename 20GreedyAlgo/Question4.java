// !         Max lenght chain  Pair
import java.util.*;        0(nlogn)
public class Question4 {
    
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o ->o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1]; // Last selected pair end //chain end
   
          for (int i = 0; i < pairs.length; i++) {
            if (pairs[i][0]> chainEnd) {
                chainEnd = pairs[i][1];
                chainLen++;
            }
          }
          System.out.println("max len of chain = "+ chainLen);
    }
}
