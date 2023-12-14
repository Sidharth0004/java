public class OOPS5 {
    public static void main(String[] args) {
       Student s1 = new Student(); 
       Student s2 = new Student("Sidharth");
       Student s3 = new Student(123);
  //      Student s4= new Student("aman",123);           ERROR DEGI
    
    }
}


    class Student{
        String name;
        int roll;

      Student(){
           System.out.println("Constructor is called...");
        }
        Student(String name ){
            this.name = name ;
            System.out.println(name);

        }
        Student (int roll){
            this.roll = roll;
        }

    }

