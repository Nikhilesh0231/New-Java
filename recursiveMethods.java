public class recursiveMethods {
  //here factorial method is recursive method as it is calling itself 
  public static int factorial(int num){
    if (num == 0){
      return 1;
    }
    else {
      return num * factorial(num - 1);
    }
  }
  public static void main(String[] args) {
    // factorial of 5 is 5! = 5*4*3*2*1
    int factOf5Is = factorial(5);
    System.out.println("Factorial of 5 is: " + factOf5Is);
  }
}
