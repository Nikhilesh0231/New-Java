public class firstExample {
  int x = 10;
  String name = "NiKhilesh";

  void add(){
    System.out.println("Inside add Function");
  }
  public static void main(String[] args) {
    //Calling non static functions
    // add();//non-static method add() cannot be referenced from a static context
    firstExample obj = new firstExample();
    System.out.println("Calling through first Object");
    obj.add();
    //Calling data members
    System.out.println(obj.name);
    System.out.println(obj.x);

    //also we can create multiple objects
    firstExample obj2 = new firstExample();
    System.out.println("Calling through second Object");
    obj2.add();
  }
}
