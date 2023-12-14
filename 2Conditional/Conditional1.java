import java.util.*;
public class Conditional1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       System.out.print("Enter the age\n");
       int age = sc.nextInt();
       if (age>=18) {
          System.out.println("adult:drive,vote");
       }  
       if (age>=13 && age<=18) {
          System.out.println("Tenager");
       }
    else{
        System.out.println("notadult");
    }
    sc.close();
    }
}
