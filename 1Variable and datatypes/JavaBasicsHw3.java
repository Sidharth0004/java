import java.util.*;
public class JavaBasicsHw3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Price of pencil,pen,eraser");
        float pencil =sc.nextFloat();
        float pen =sc.nextFloat();
        float eraser=sc.nextFloat();
        float bill =pencil+pen+eraser;
        float gst = (0.18f)*bill;
        float advancedbill = bill +gst;
        System.out.print("Advanced Bill\n");
        System.out.print(advancedbill);
        sc.close();

    }
    
}
