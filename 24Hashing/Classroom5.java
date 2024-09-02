                        // ! Valid Anagrams   // 0(n)
import java.util.*;
public class Classroom5 {

    public static boolean isAnagrams(String s , String t){
        if (s.length() != t.length()) {
            return false;
        }
HashMap<Character,Integer> map = new HashMap<>();

for (int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    map.put(ch, map.getOrDefault(ch, 0)+1);
}
for (int j = 0; j < t.length(); j++) {
    char ch = t.charAt(j);
    if (map.get(ch) != null) {
        if (map.get(ch) == 1) {
            map.remove(ch);
        }
        else{
            map.put(ch, map.get(ch) - 1);
        }
    }else{
        return false;
    }
}
return map.isEmpty();
    }
   public static void main(String[] args) {
    String s = "tulip";                      //! 0(n)  n= no of character of string
    String t = "lipid";

    System.out.println(isAnagrams(s, t));
   }  
}
