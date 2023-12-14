public class ArrayFun {
    public static void Update(int mark[],int nonchangeable){{
        for (int i = 0; i < mark.length; i++) {
            nonchangeable=10;
            mark[i]+=1;

        }
    }}
    public static void main(String[] args) {
        int marks[]={97,98,99};
        int nonchangeable =5;
        Update(marks,nonchangeable);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]+" ");
        }
        System.out.print(nonchangeable);
    }
}
