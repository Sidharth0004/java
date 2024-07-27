public class Polymorphism {   
    public static void main(String[] args) {
          // ! Overriding
        Deer d = new Deer();
        d.eat();
        // ! Overloading
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 2));
        System.out.println(calc.sum((float) 1.3, (float) 1.5));
        System.out.println(calc.sum(1, 2, 3));
    }

}

class Animals {
    void eat() {
        System.out.println("Eats anything");
    }
}

class Deer extends Animals {
    void eat() {
        System.out.println("Eats Grass");
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}