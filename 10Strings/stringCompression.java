public class stringCompression {
    public static String Compress(String str){
        String newStr = "";
       for (int i = 0; i < str.length(); i++) {
        Integer count =1;
        while (i<str.length()-1   && str.charAt(i)==str.charAt(i+1)) {
            i++;
            count++;

        }
        newStr += str.charAt(i);
        if (count>1) {
            String c=count.toString();
            newStr += c;
        }
        
       }
       return newStr;
    }
 public static void main(String[] args) {
    String str = "aaabbcccdd";
    System.out.println(Compress(str));
 }
    
}
