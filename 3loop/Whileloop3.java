import java.util.*;
public class Whileloop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int sum=0;
        System.out.print("Enter the number to which you want sum\n");
        int num = sc.nextInt();
        while (counter <= num) {
            sum+=counter;
            counter++;
            
        }
        System.out.println("The sum of n natural num is :"+sum);


        sc.close();
    }
}
