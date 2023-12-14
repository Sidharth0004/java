import java.util.*;
public class Conditional4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age\n");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.print("Adult\n");
        }
        else if (age>=13 && age<18) {
            System.out.print("Tenager\n");
        }
    else {
        System.out.print("Child");
        }
        sc.close();
    }
}
