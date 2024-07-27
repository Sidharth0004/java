public class Inheritance {
    public static void main(String[] args) {
    CarBrand1 car = new CarBrand1(); 
    System.out.println(car.brand);
    System.out.println(car.type);
   
 
    CarBrand  c = new CarBrand("Mahindra", "Manual");
    }
   }
   class CarBrand {
    String brand = "Volkswagen";
    String type = "Automatic"; // in %pam
    CarBrand() {
    System.out.println("Parent CarBrand called.");
    }
    CarBrand(String brand, String type) {
    this.brand = brand;
    this.type = type;
    System.out.println("Brand is " + brand + " and type is " + type);
    }
   }
   class CarBrand1 extends CarBrand {
    String CarBrand1 = "Tata";
    String type = "Manual";
    CarBrand1() {
    // Explicitly call the parent class constructor
    super();
    System.out.println("Child CarBrand called");
    }
   }
