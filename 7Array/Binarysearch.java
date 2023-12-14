import java.util.*;
public class Binarysearch {
    public static int Binary_Search(int numbers[],int key){
        int start =0, end =numbers.length-1;
    while(start<=end){
        int mid = (start+end)/2;
        if (numbers[mid]==key) {
            return mid;
        }
        if (numbers[mid]<key) {
            start=mid+1;   
        }
        else
        end=mid-1;
        start++;
    }
    return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[]= new int[7];
      //  int numbers[]={2,4,6,8,10,12,14};
         for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the"+i +"element of an array");
            numbers[i]=sc.nextInt();
       }
        System.out.println("Enter the key to search");
        int key=sc.nextInt();
        System.out.print("Index for key is:"+ Binary_Search(numbers, key));
        sc.close();
    }
}
