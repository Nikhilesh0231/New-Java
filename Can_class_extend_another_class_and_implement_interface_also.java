interface myInterface{
  public void my_Interface_Method();
}
class myClass{
  public void my_Class_Method(){
    System.out.println("This is My Class method");
  }
}
public class Can_class_extend_another_class_and_implement_interface_also extends myClass implements myInterface{
  @Override
  public void my_Interface_Method(){
    System.out.println("This is My Interface method");
  }
  public static void main(String[] args) {
    Can_class_extend_another_class_and_implement_interface_also obj = new Can_class_extend_another_class_and_implement_interface_also();
    obj.my_Interface_Method();
    obj.my_Class_Method();
  }
}
