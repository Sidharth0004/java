import java.util.*;
public class Halfpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the number of line\n");
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            for (int number = 1; number <=line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
        sc.close();

    }
}
