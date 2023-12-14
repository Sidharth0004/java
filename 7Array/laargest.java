

//import java.util.*;
public class laargest {
    public static int getLargest(int numbers[]){
        int largest= Integer.MIN_VALUE; //-infinity
        int smallest =Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>largest) {
                largest=numbers[i];   
            }
            if (numbers[i] < smallest) {
                smallest=numbers[i];
            }  
        }
        System.out.println("Smallest value is: "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] ={1,2,6,3,5};
        System.out.print("largest value is"+getLargest(numbers));

    }
}
