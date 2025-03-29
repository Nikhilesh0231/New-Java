public class Scope_Of_Variable {
  public void display(){
    int x = 10;
    System.out.println("inside display method x = " + x);
  }
  public static void main(String[] args) {

    // System.out.println("inside class x = " + x);//we can not access the value of x from diplay method
    int y = 12;
    System.out.println("Inside class the value of y is : " + y);
    {
      int x = 20;
      System.out.println("inside a block of x = " + x);
    }
    // System.out.println("Outside block value of x = "+x);//we can no access the value of out of that block in which it is declared.

  }  
}
