import java.util.*;
public class Conditional5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your income");
    int income =sc.nextInt();
    int tax;
    if (income<500000) { 
        tax=0;
    }
    else if (income>=500000 && income<1000000) {
        tax= (int)(0.20*income);
    }
    else{
        tax=(int)(0.30*income);
    }
     System.out.println("Your tax is :"+tax);
     sc.close();
    }
}
