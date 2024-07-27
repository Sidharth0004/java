public class interFaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves(); 
    }
}

interface ChessPlayer{
    void moves();   
}
class Queen implements ChessPlayer{
  public  void moves(){
        System.out.println("up,down,left,right,diagonal ");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right , left");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left , right,diagonal -(by one step)");
    }
}