public class third {
  public static void check(int a) throws ArithmeticException{
    if(a<19)
    {
      throw new ArithmeticException("Access denied");
    }
    else
    {
      System.out.println("Access granted");
    }
  }
  public static void main(String[] args) {
    check(29);
  }  
}
