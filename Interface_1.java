interface shape{
  void area(int l ,int b);
}
class first implements shape{
  public void area(int l ,int b){
    System.out.println("Area of rectangle is "+l*b);
  }
}
public class Interface_1 extends first{
  public static void main(String[] args) {
    Interface_1 i = new Interface_1();
    i.area(10,20);
  }
}
