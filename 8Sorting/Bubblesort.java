import java.util.*;
public class Bubblesort {
    public static void bubbleSort(int arr[]){
        int temp=0;
        for (int i = 0; i <  arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    
    }
    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,1,2};
        bubbleSort(arr);
        printarr(arr);
    }
}
