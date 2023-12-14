public class BinaryToDecimal {
    public static void BinToDec(int binNum){
        int MyNum = binNum;
        int pow = 0;
        int decNum=0;
        while (binNum>0) {
            int lastdigit=binNum%10;
            decNum+=  (lastdigit*Math.pow(2,pow));
            pow++; 
            binNum/=10;
        }
      System.out.print("decimal of "+ MyNum+"="+ decNum);
    }
    public static void main(String[] args) {
        BinToDec(101);
    }
}
