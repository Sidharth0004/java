public class checkOddEven {
    public static void OddOrEven(int n){
        int bitmask = 1;
        if( (n & bitmask)==0) {
            System.out.println("Even number ");
        }
        else
        System.out.println( "Odd number" );
    }
    public static void main(String[] args) {
        OddOrEven(3);
        OddOrEven(11);
        OddOrEven(14);
    }
}
