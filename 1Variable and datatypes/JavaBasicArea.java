import java.util.*;
public class JavaBasicArea {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Radius of Circle\n");
        float rad = sc.nextFloat();
        float area = 3.14f*rad*rad;
        System.out.print(area);
        sc.close();
    
        
    }
    
}
