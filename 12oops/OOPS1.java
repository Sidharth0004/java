
public class  OOPS1{
   
   public static void main(String[] args) {
    Pen p1 = new Pen();  // Created a pen object called p1
    p1.setColor("Blue");
    System.out.println(p1.color);
    Student  s1 = new Student();
    s1.calcPercentage(50, 40, 40);
    System.out.println(s1.percentage);
    p1.setTip(5);
    System.out.println(p1.tip);
   // p1.setColor("Yellow");
    p1.color = "Yellow";
    System.out.println(p1.color);
    BankAccount myAcc = new BankAccount();
    myAcc.username = "Sidharth";
   // myAcc.password ="vhvshsj";     // YE LINE NHI RUN KREGI KYUKI PRIVATE HAI
   myAcc.setPassword("dfdsghfsgk");
   }
}
class BankAccount{
    public String username;
    private String password;
    void setPassword(String pwd){
        password = pwd ;
    }

}



    class Pen{
    String color;
    int tip ;
  
  
    void setColor(String newColor){
      color = newColor;
    }
    void setTip(int newTip){
      tip =newTip;
    }
  }
  
  class Student{
      String name;
      int age;
      float percentage;
  
      void calcPercentage(int phy , int chem , int math){
          percentage = (phy + chem + math)/3;
  
      }}
