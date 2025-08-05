import java.util.Arrays;

public class ClimbStairs {
   
    // memoziation -0(n)
    public static int countWays(int n , int []dp){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
  
        if (dp[n] != -1) {
            return dp[n];

        }

        dp[n] = countWays(n-1, dp) + countWays(n-2, dp);

        return dp[n];
 

    }

    public static int countWaysTab(int n){
        int dp[] = new int[n+1];
        dp[0]=1;


        //Tabulation loop
        for (int i = 1; i <= n; i++) {
            if (i==1) {
                dp[i]=dp[i-1];
            }
             else{
                dp[i]= dp[i-1] + dp[i-2];
             }

        }

        return  dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        int ways [] = new int[n+1];

        Arrays.fill(ways, -1);
        System.out.println(countWays(n, ways));

        System.out.println(countWaysTab(n));

    }
}
