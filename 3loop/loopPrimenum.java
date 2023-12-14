import java.util.*;
public class loopPrimenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to check weather it is prime or not :");
        int n =sc.nextInt();
        if (n==2) {
            System.out.print("n is PRIME");
        }
        else{
   boolean isPrime = true;
  // for (int i = 2; i < n-1; i++)
  for(int i =2; i<= Math.sqrt(n); i++) {
    if (n%i==0) {
        isPrime=false;
    }
   }
   if ( isPrime==true) {
    System.out.println("n is PRIME");
   }
   else
   System.out.println("n is not Prime");}
   sc.close();
    }
}
