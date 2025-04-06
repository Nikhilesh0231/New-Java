class Shape{
  public void display(){
    System.out.println("Shape");
  }
}
class Square extends Shape{
  @Override
  public void display(){
    System.out.println("Square");
  }
}
public class Virtual_Function_in_polymorphism {
  public static void main(String[] args) {
    //This is called as runtime polymorphism
    Shape s;
    s = new Shape();
    s.display();
    s = new Square();
    s.display();
  }
}
