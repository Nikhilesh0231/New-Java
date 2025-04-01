public class BooleanExpression {
  public static void main(String[] args) {
    boolean b1 = false;
    boolean b2 = false;
    if(b1 == true && b2 == true){
      System.out.println("Both are true");
    }
    else if(b1 == true || b2 == true){
      System.out.println("One of them is true");
    }
    else{
      System.out.println("None of them are true");
    }
  }
}
