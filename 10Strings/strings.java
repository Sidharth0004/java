import java.util.*;

public class strings { 
    public static void printLetter(String str){
        for (int i = 0; i < str.length(); i++) {
             System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
   /*  Char arr[]={'a','b','c'};
    String str = "abcd";
    String str2 = new String("xyz");
                                                         // String is IMMUTABLE
    Scanner sc = new Scanner(System.in);
    String name ;
    name = sc.nextLine();
     System.out.println(name);   */
     //String fullName = "  Tony Stark";
     //System.out.println(fullName.length());
      
                                                             // CONCATENATION
        String firstName ="Sidharth";
        String lastName = "Yadav";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName + " is this");
      //  System.out.println(fullName.charAt(0));
        printLetter(fullName);
     }
    
}
