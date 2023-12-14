public class abstra {
    public static void main(String[] args) {
       /*   Horse h = new Horse();
        h.eat();
       h.walk();
        System.out.println(h.color);
        Chicken c = new Chicken();
        c.eat();
        c.walk(); */
        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustang
        
    }
}
abstract class Animal{
    String color;
    Animal(){
       // color = "brown";
       System.out.println("animal constructor is called");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor is called...");
    }
    void changecolor(){
        color = "dark brown";
    }
void walk(){
    System.out.println("Walks on four legs");
}
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor is called...");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("Walks on two legs");
    }
}