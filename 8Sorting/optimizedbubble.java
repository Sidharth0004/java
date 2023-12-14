import java.util.*;
public class optimizedbubble {
    public static void bubbleSort(int arr[]){
        int temp=0;
    
        for (int i = 0; i <  arr.length-1; i++) {
            int swap=0;
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;     
                }
    }
        if (swap==0) {
           break; 
        }
        System.out.println(swap);
        }
    }
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        bubbleSort(arr);
        printarr(arr);
    }
}