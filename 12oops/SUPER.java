public class SUPER {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.color);
    }
}
class Animals {
    String color;
    Animals(){
        System.out.println("animal condtructor is called ");
    }
}class Horse extends Animals {

        Horse(){
            super.color =" brown";
            System.out.println("Horse constructor is called");
        }
    }
