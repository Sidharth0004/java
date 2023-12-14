

public class MaxSubarray2 {
    public static void maxSubarraysum(int numbers[]){
        int maxsum =Integer.MIN_VALUE;
        int currsum=0;
        int prefix[]=new int[numbers.length];
        prefix[0]=numbers[0];
        //calculate prefix array
        for (int i = 1; i < numbers.length; i++) {
            prefix[i]=prefix[i-1]+numbers[i];  
            System.out.println(prefix[i]);
        }   
        
        for (int i = 0; i < numbers.length; i++) {
            int start=i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
               if (start==0) {
                    currsum=prefix[end];
                }
                else{
                currsum=prefix[end]-prefix[start-1];
              //  System.out.println(currsum);
            }
              //  currsum=start==0 ? prefix[end]:prefix[end]-prefix[start-1];
              /*   if (maxsum<currsum) {
                    maxsum=currsum;
                    
                }*/
                maxsum = Math.max(maxsum, currsum);
        }
        }
        System.out.print("max sum="+ currsum);
    }
public static void main(String[] args) {
    int numbers[]={1,-2,6,-1,3};
    maxSubarraysum(numbers);
}
}
