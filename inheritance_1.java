class BaseClass{
  public int m = 100;

  public void display(){
    System.out.println("Parent Class.");
  }
}
public class inheritance_1 extends BaseClass {

  public void childDisplay(){
    System.out.println("Child Class");
  }
  public static void main(String[] args) {
    BaseClass b1 = new BaseClass();
    b1.display();
    inheritance_1 obj = new inheritance_1();
    obj.childDisplay();
    obj.display();
    System.out.println(obj.m);
    obj.m = 50;
    System.out.println(obj.m);   
  }
}
