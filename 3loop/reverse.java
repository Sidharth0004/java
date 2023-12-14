import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  rem;
        System.out.println("Enter any number ");
        int number = sc.nextInt();
        while (number>0) {
            
        
            rem=number%10;
            
            System.out.print(rem);
            number=number/10;
        }
        
        sc.close();
    }
}
