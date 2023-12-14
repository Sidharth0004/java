import java.util.*;
public class Conditional8 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int marks = sc.nextInt();
         String reportcard = marks>=33 ?"PASS":"FAIL";
         System.out.println(reportcard);
         sc.close();
     }
}
