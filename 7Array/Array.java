import java.util.*;
public class  Array {
    public static void main(String[] args) {
    int marks[]=new int[5];
    Scanner sc =new Scanner(System.in);
    for (int i = 0; i < marks.length; i++) {
        System.out.println("Enter the element of an array"+i);
        marks[i]=sc.nextInt();
    }
    for (int i = 0; i < marks.length; i++) {
        System.out.println(marks[i]);
    }
    sc.close();
    }
}
