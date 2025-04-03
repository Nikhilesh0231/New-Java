class Shape{
  public void display(){
    System.out.println("Shape Class");
  }
}
class Circle extends Shape{
  public void display(){
    System.out.println("Circle Class");
  }
}
class Square extends Shape{
  public void display(){
    System.out.println("Square Class");
  }
  //this is the example of method overloading
  public void display(int a){
    System.out.println("Square Class with parameter");
  }
}
//in all three classes display method is overrided
public class Polymorphism_one_name_many_form {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    c1.display();
    Square s1 = new Square();
    s1.display();
    Square s2 = new Square();
    s2.display(3);

    //Example for operator overloading
    int a = 10;
    int b = 20;
    int c = a + b;
    System.out.println("Sum of a and b is " + c);
    String a1 = "Hello";
    String b1 = "World";
    String C1 = a1 + b1;
    System.out.println("Concatenation of a1 and b1 is " + C1);
    // in above cases in first case '+' is used as addition and in second case '+' is used as Concatenation.

  }
}
