import java.util.Scanner;

public class Problem3 {
  //Factorial
  public static int factorial(int n){
    if(n==0){
      return 1;
    }
    else{
      return n * factorial(n-1);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    //Approach1 
    System.out.println("Factorial of " + n + " is " + factorial(n));
    //Approach2
    int fact = 1;
    for(int i=1;i<=n;i++){
      fact *=i;
    }
    System.out.println("Factorial of " + n + " is " + fact);
    sc.close();
  }
}
