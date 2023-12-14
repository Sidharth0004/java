public class lastoccur {
    public static int LastOccurence(int arr[],int key , int i){
        if (i==arr.length ) {
           return -1; 
        }
        int isFound= LastOccurence(arr, key, i+1);
        if ( isFound==-1 && arr[i]==key) {
            return i;
        }
        return isFound;
        
    }
    public static void main(String[] args) {
        int arr[]={9,1,3,4,5,1,6};
        System.out.println(LastOccurence(arr, 1, 0));
    }
}
