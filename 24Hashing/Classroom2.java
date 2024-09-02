import java.util.*;
public class Classroom2 {
    
static class HashMap<K,V>{ // Genrics method - in this we dont defined return value here one is for Key and other is for value

    private class Node{
        K key;
        V value;
        public Node(K key , V value){
            this.key = key;
            this.value = value;
        }
    }

    private int n ; //n
    private int N;
    private LinkedList<Node> buckets[]; //N = buckets.length
    @SuppressWarnings("unchecked");

    public HashMap(){
  
        this.N =4;
        this.buckets = new LinkedList[4];

        for (int i = 0; i < 4; i++) {
            this.buckets[i] = new LinkedList<>(); 
        }
    }
         
    private int hashFunction(K key){
          int hc = key.hashCode();
          // 1234567 ; -123456
       
        return  Math.abs(hc) % N;

    }
    private int SearchInLL(K key , int bi){
        LinkedList<Node> ll = buckets[bi];

          for (int i = 0; i < ll.size(); i++) {
            Noded node =  ll.get(i);
            if (node.key == key) {
                return di;
            }
            di++;
          }
          return -1;

    }
    private void rehash(){
        LinkedList<Node> oldBu
    }
    public void put (K key , V value){
        int bi = hashFunction(key); // 0 to 3
        int di = SearchInLL(key);      //valid index ; -1
  
        if (di != -1) {
            Node node = buckets[bi].get(di);
            node.value = value;
        }else{
            buckets[bi].add(new Node(key , value));
            n++;
        }
        int lambda =  (double)n/N;
        if (lambda >2.0) {
            rehash();
        }
    }

}


    public static void main(String[] args) {
        
    }
}
