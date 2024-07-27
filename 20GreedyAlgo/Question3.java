            //! Minimun Absolute Difference Pairs
import java.util.*;               //0(nlogn)
public class Question3 {
    

    public static void main(String[] args) {
        int A[] ={1,2,3};
        int B[] ={2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff = 0;
        for (int i = 0; i < B.length; i++) {
            minDiff +=Math.abs(A[i]-B[i]);
        }
        System.out.println("Min Absolute difference pair = " + minDiff);
    }
}
