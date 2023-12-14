import java.util.*;
public class Continueinloop1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter your number:\n");
            int n =sc.nextInt();
           // System.out.println(n);
            if (n%10==0) {
                continue;
            }
            System.out.println("Number entered was:"+n);
      
        } while (true);
        
        
    
    }
}
