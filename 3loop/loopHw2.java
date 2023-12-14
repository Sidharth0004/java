import java.util.*;
public class loopHw2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int fact=1;
        System.out.print("Enter the number\n");
        int num =sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact*=i;
            
        }
        System.out.print("factorial of given number is :"+fact);
        sc.close();
    }
}
