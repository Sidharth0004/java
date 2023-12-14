import java.util.*;
public class breakinloop1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         do {
            System.out.print("Enter your number: ");
            int n = sc.nextInt();
          //  System.out.println(n);
            if (n%10==0) {
                break;
            }
            System.out.println(n);
         } while (true);
         sc.close();
}
}