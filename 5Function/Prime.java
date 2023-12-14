public class Prime {
    public static boolean isPrime(int n){
     /*  boolean isPrime=true;
       for (int i = 2; i < n; i++) {
        if (n%i==0) {
            isPrime=false;
            break;
        }}
        return isPrime;    
    */ 
    if (n==2) {
        return true;
    }
for (int i = 2; i < n; i++) {
    if (n%i==0) {
        return false;
    }
}
return true; }
    public static void main(String[] args) {
        System.out.print(isPrime(2));
    }
}
