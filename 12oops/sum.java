public class sum {
    public static int Sum(int n){
        if (n==1) {
            return 1;
        }
    int add = n + Sum(n-1);
    return add;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Sum(n));
    }
}
 