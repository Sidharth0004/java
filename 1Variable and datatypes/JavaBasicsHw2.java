import java.util.*;
public class JavaBasicsHw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("area of square is :" + area );
        sc.close();

    }
    
}
