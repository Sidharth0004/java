import java.util.*;
public class star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the the number of line\n");
        int n = sc.nextInt();
        for (int line = 1; line <= n; line++) {
            for (int star = 1; star <=line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}
