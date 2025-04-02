class Sample1{
  protected int x = 10;
  void display(){
    System.out.println("Hello, World!");
    System.out.println("This is Sample1");
  }
}
class Sample2 extends Sample1{

  public int x = 20;
  void display(){

    //now it will first call Sample1 display method
    super.display();
    System.out.println("Hello, World!");
    System.out.println("This is Sample2");
    System.out.println("Value of x is in Sample2  "+x);
    System.out.println("Value of x in Sample1 "+super.x);
  }
}
public class Method_Overriding {
  public static void main(String[] args) {
    Sample2 obj = new Sample2();
    obj.display();//it always call child class method because display method is override
  }
}
