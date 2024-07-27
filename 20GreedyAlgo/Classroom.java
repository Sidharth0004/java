import java.util.*;
   

public class Classroom {

    public static int minOperations(int[] nums) {
        int[] count = new int[100]; 

    
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int operations = 0;

        
        for (int i = 0; i < count.length; i++) {
            int freq = count[i];
          if (freq ==2 || freq==3) {
            operations ++;
          }
          else if (freq % 2 ==0) {
            operations += freq/2;
          }
          else if (freq % 3 ==0) {
            operations += freq/3;
          }
          else if(freq % 3==2){
            operations += freq/3;
            operations += 1;
          }
          else{
            return -1;
          }

        
        }

        return operations;
    }

    public static void main(String[] args) {
       
        int[] nums = {14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12};
        int result = minOperations(nums);
        System.out.println(result);
        int k = 5/3;
        System.out.println(k);
}
}


