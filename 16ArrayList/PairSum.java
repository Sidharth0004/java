import java.util.*;

public class PairSum {

  //                              // Brute force Tc(n^2)

    // public static boolean pairSum1(ArrayList<Integer> list, int target) {

    //     for (int i = 0; i < list.size(); i++) {
    //         for (int j = i + 1; j < list.size(); j++) {
    //             if (list.get(i) + list.get(j) == target) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public static boolean pairSum1(ArrayList<Integer> list , int target){
        int Lp=0;
        int Rp=list.size()-1;
        while (Lp<Rp) {   // Lp!=Rp    
           if (list.get(Lp)+list.get(Rp)==target) {
            return true;
           } 
           else if (list.get(Lp)+list.get(Rp)<target) {
            Lp++;
           }
           else{
            Rp--;
           }
        }
        return false;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // 1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 9 ;
        System.out.println(pairSum1(list, target));
    }

}
