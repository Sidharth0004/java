import java.util.ArrayList;

public class Classroom2 {         //! for max heap change the sign 
    
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){
            // add at last index
            arr.add(data);
           int x =   arr.size()-1;  // x is child index
            int par = (x-1)/2;
            while (arr.get(x) < arr.get(par)){   //log(n)
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            
             }

        }
        public int peek(){
            return arr.get(0);
        
        }

        

        private void heapify(int i){ // 0(log(n))
         int left =  2*i+1;
         int right = 2*i+2;
         int minIdx = i;
            if (left < arr.size() && arr.get(left)   <  arr.get(minIdx)){
                minIdx = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(minIdx)){
                minIdx = right;
            }
                if (minIdx != i){
                    int temp = arr.get(i);
                    arr.set(i, arr.get(minIdx));
                    arr.set(minIdx, temp);
                    heapify(minIdx);
                }
        }

        public int remove(){
            int data = arr.get(0);
            // swap first and last element
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            // remove last element
            arr.remove(arr.size()-1);
            heapify(0);
            return data;

        }
        public Boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        
        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);
        while (!pq.isEmpty()){    // heap sort - 0(n(log(n)))
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
