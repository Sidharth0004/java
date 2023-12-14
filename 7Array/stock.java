import javax.annotation.processing.SupportedSourceVersion;

public class stock {
public static void MaxProfit(int prices[]){
int buy =prices[0],max_profit=0;
for (int i = 0; i < prices.length; i++) {
    if (buy>prices[i]) {
        buy=prices[i];
    }
    else if(prices[i]-buy>max_profit){
       max_profit= prices[i]-buy;
    }
}
System.out.println(max_profit);
}
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        MaxProfit(prices);
    }
}
