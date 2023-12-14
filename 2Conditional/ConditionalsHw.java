import java.util.*;
public class ConditionalsHw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number\n");
        int num= sc.nextInt();
        if (num>0) {
            System.out.print("Entered numner is positive\n");
        }
        else{
            System.out.print("Entered number is negative");
        }
        sc.close();

    }
}
