import java.util.*;
 public class MostWater {
//     public static int storeWater(ArrayList<Integer> height){
//         int maxWater = 0;
                      
                                                       // Brute Force    Tc- 0(n^2  )
//         for (int i = 0; i < height.size(); i++) {
            
//             for (int j = i+1; j < height.size(); j++) {
//                 int ht = Math.min(height.get(i), height.get(j));
//                 int width = j-i;
//                 int curWater = ht*width;
//                 maxWater= Math.max(maxWater, curWater);
//             }
//         }
//         return maxWater;
//     }

                            // TC = 0(n )
public static int storeWater(ArrayList<Integer> height){
    int maxWater = 0;
    int lp=0;
    int rp = height.size()-1;

     while (lp<rp) {
        //Caculate the water area
        int ht = Math.min(height.get(lp), height.get(rp));
        int width=rp-lp;
        int curWater= ht * width;
        maxWater= Math.max(maxWater, curWater);
        //Update ptr
        if (height.get(lp)<height.get(rp)) {
            lp++;
        }  else{
            rp--;

        }
     }
     return maxWater;
}


    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        // 1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));

    }
}
