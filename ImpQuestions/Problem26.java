
import java.util.Scanner;

public class Problem26 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number : ");
    int num1 = sc.nextInt();
    System.out.print("Enter second number : ");
    int num2 = sc.nextInt();
    System.out.print("\n Enter operations ( + , - , * , / ) : ");
    String op = sc.next();
    sc.close();
    int result = 0;
    switch (op) {
      case "+": result = num1 + num2 ; break ;
      case "-": result = num1 - num2 ; break ;
      case "*": result = num1 * num2 ; break ;
      case "/": if(num2 != 0) result = num1 / num2 ; else result = -1;
      default: System.out.println("Invalid operation");
    }
    if(result != -1)
      System.out.println("\n Result : " + result);
    else
      System.out.println("Error : Division by zero is not possible");
  }
}
