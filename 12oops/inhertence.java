public class inhertence {
    public static void main(String[] args) {
        //Fish shark = new Fish();
       // shark.eat();
        Dog rocky = new Dog();
        rocky.eat();
        rocky.legs = 4;
        System.out.println(rocky.legs);
        
    }
}
//Base class
class Animal {
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }

}
//Derived class

/*class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}*/
class Mammal extends Animal{
    int legs;

}
class Dog extends Mammal{
    String breed;
}