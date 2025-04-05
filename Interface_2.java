interface myInterface{
  public void method1();
  public void method2();
}
interface yoursInterface extends myInterface{
  public void method3();
}
public class Interface_2 implements yoursInterface {
  public void method1(){
    System.out.println("Method 1 from myInterface");
  }
  public void method2(){
    System.out.println("Method 2 from myInterface");
  }
  public void method3(){
    System.out.println("Method 3 from yoursInterface");
  }
  public static void main(String[] args) {
    Interface_2 obj = new Interface_2();
    obj.method1();
    obj.method2();
    obj.method3();
  }
}
