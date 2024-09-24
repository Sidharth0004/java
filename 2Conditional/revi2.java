public class revi2 {
   public static void main(String[] args) {
    String s =  "a good   example";
    String[] str = s.split(" ");
    System.out.println(str.length);
    
    for (int i = 0; i < str.length; i++) {
        System.out.println(str[i]);
    }
   } 
}
