import java.util.*;
public class hwcountvowel {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    str = str.toLowerCase();
    int count=0;
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == 'a' || ch =='i' || ch == 'o' || ch =='u'|| ch == 'e' ) {
          count++;  
        }
    }
    System.out.println("count of vowel is :" + count);
}
}
