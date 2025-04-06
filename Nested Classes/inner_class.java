//Non static inner class I-> Member inner class
// public class inner_class {
//   private int i = 10;
//   class inner{
//     public void display() {
//       System.out.println("Inner class variable: " + i);
//     }
//   }

  // public static void main(String[] args) {
    //Non static inner class I-> Member inner class

    // inner_class obj = new inner_class();
    // inner_class.inner in = obj.new inner();
    // in.display();
//   }
// }

//Non static inner class I-> Anonymous inner class
abstract class anonymous_inner_class{
  abstract void message();
}


public class inner_class {
  public static void main(String[] args) {
    //Non static inner class I-> Anonymous inner class
    anonymous_inner_class obj = new anonymous_inner_class(){
      public void message() {
        System.out.println("Hello, Anonymous Inner Class");
        } 
      };
      obj.message();
  }
}
