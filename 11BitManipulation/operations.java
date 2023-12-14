public class operations {
    public static int getIthBit(int n,int i){
        int bitmask= 1<<i;
        if ((n&bitmask)==0) {
            return 0;
        }
        else 
        return 1;

    }
    public static int SetIthBit(int n,int i){
        int bitmask = 1<<i;
        return n|bitmask;

    }
    public static int ClearIthBit(int n , int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int updateIthBit(int n ,int i , int newBit){
     /*    if (newBit == 0) {
            return ClearIthBit(n, i);
        }
        else
        return SetIthBit(n, i);*/
        n = ClearIthBit(n, i);
        int bitmask =newBit<<i;
        return n|bitmask;}
        public static int clearIBits(int n , int i){
            int bitMask = (~0)<<i;
            return n & bitMask;
        
    }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        System.out.println(SetIthBit(10, 2));
        System.out.println(ClearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearIBits(15, 2));
    }
}
