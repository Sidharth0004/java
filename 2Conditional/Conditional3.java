import java.util.*;
public class Conditional3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number\n");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.print("Given number is Even\n");
        }else{
            System.out.print("Given number is Odd\n");
        }
        sc.close();
    }
    
}
