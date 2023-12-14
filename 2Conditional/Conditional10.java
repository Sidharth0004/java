import java.util.*;
public class Conditional10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a =sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.print("Choose operator\n");
        char opt =sc.next().charAt(0);
        
 switch (opt) {
    case '+':
        System.out.print(a+b);
        break;
        case '-':
        System.out.print(a-b);
        break;
        case'*':
        System.out.print(a*b);
        break;
        case '/':
        System.out.print(a/b);
        break;
        case'%':
        System.out.print(a%b);
        break;
 
    default: System.out.print("wrong opt");
        break;
 }
 sc.close();
    }
}
