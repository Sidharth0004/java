public class reverse {
    public static void Reverse(int numbers[]){
        int first =0,last=numbers.length-1;
        int temp;
        while (first<last) {
            temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
         first++;
         last--;
        }
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,4};
       Reverse(numbers);
       for (int i = 0; i < numbers.length; i++) {
        System.out.print(numbers[i]+" ");
       }
    }
}
