import java.util.*;
public class JavaBasicsHW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        float num1 = sc.nextInt();
        System.out.println("Enter the num2" ) ;
        float num2 =sc.nextInt();
        System.out.println("Enter the num3" );
        float num3 =sc.nextInt();
        float avg = (num1+num2+num3)/3;
        System.out.println(avg);
        sc.close();
    }
    
}
