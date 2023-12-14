public class MaxSubarray {
    public static void printsubarraySum(int numbers[]){
        int max =Integer.MIN_VALUE;
        int sum =0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                sum=0;
                for (int k = i; k <= j; k++) {
                    sum+=numbers[k];
                }
                System.out.print(sum);
                    if (sum>max) {
                        max=sum; 
                    }
                
                System.out.println();
            }
        }
        System.out.print("Max subarray"+max);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
   printsubarraySum(numbers);
    }
}
