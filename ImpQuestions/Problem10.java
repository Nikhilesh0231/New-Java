
import java.util.Scanner;

public class Problem10 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to check for the prime : ");
    int n = sc.nextInt();
    sc.close();
    System.out.println(Math.sqrt(n));
    if(n == 0 || n == 1){
      System.out.println(n + " is not a prime number");
    }
    else if(n == 2){
      System.out.println(n + " is a prime number");
    }
    else{
      for(int i = 2; i <= Math.sqrt(n); i++){
        if(n % i == 0){
          System.out.println(n + " is not a prime number");
          break;
        }
      }}
  }
}
