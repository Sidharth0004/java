public class arithmatic {
    public static void main(String[] args) {
    //     int A=10;
    //     int B=5;
    //    System.out.print("add ="+(A+B)); 
    String str ="aaab";
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
       int freq = ch -'a';
        System.out.println(freq);
    }

    }
}
