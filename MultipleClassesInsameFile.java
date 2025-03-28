public class MultipleClassesInsameFile {
  public static void main(String[] args) {
    One o1 = new One();
    o1.add();
  }
}

class One{
  int x = 10;
  int y = 20;
  void add() {
    System.out.println("Object Class one");
    int res = x + y;
    System.out.println("Result is: "+res);
  }
}