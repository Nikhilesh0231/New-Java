class Base{
  int x ;
  Base(int a){
    x = a;
  }
}
class Derived extends Base{
  int y ;
  Derived(int a , int b){
    super(a);
    y = b;
  }
  void show(){
    System.out.println("The Value of x = "+x+" and the value of y is "+y);
  }
}
public class superKeyword {
  public static void main(String[] args) {
    Derived d1 = new Derived(2, 3);
    d1.show();
  }  
}
