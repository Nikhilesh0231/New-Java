public class static_inner_class {
  static int i = 10;

  static class two{
    static void message(){
      System.out.println("Data : "+i);
    }
    void mesaage_nonStatic(){
      System.out.println("Non static method");
    }
  }
  public static void main(String[] args) {
    static_inner_class.two.message();
    // static_inner_class.two.mesaage_nonStatic();//we can not call non static method without creating  creating object
    static_inner_class.two obj = new static_inner_class.two();
    obj.mesaage_nonStatic();//Now we are able to call that method
  }
}
