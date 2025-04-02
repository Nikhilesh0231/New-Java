class Base {
  int x;
  Base(int a) {
    x = a;
  } 
  int y;
  Base(int a , int b) {
    this(a);
    y = b;
  }
  void display(){
    System.out.println("The value of x is "+ x + " and value of y is "+y);
  }
}
public class constructor_this_keyword {
  public static void main(String[] args) {
    Base b1 = new Base(2,3);
    b1.display();
  }
}
