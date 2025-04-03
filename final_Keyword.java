final class Base{
  void display(){
    System.out.println("Base class");
  }
}
//We cn not extend final class
// class Child extends Base{
//   void display(){
//     System.out.println("Child class");
//   }
// }

public class final_Keyword {
  final int display(int a){
    return a*a;
  }
  //we can not override the method
  // int display(int a){
  //   return 2*a;
  // }
  public static void main(String[] args) {
    // final keyword in java
    // final variable
    final int a = 10;
    // a = 20; // This will give compilation error
    System.out.println("Value of a is: " + a);

  }
}
