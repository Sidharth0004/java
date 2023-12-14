import java.util.*;
public class loopHw3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the who's you want to print table\n");
        int num=sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num +"*" +i + "=" +num*i );
        }
        sc.close();
    }
}
