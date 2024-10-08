public class starircaseSearch2 {
    public static void StaircaseSearch(int matrix[][],int key){
        int row=matrix.length-1,col=0;
        while (row>0 && col< matrix[0].length) {
            if (matrix[row][col]==key) {
                System.out.println("found key at ("+row+","+col+")");
                break;
            }
           else if (key<matrix[row][col] ) {
                row--;
            }
            else 
            col++;
        }
        System.out.println("Key not found");
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
        {15,25,35,45},
       {27,29,37,48},
       { 32,33,39,50}};
       int key=50; 
       StaircaseSearch(matrix, key);
    }
}
