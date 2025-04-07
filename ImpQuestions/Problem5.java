import java.util.Scanner;

public class Problem5 {
  public static void fibonacci(int n){
    int n1 = 0;
    int n2 = 1;
    System.out.print(n1 + " " + n2 + " ");
    int i = 0;
    while(i < n - 2){
      int temp = n1 + n2;
      n1 = n2;
      n2 = temp;
      System.out.print(n2 + " ");
      i++;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the numbers of elements in series : ");
    int n = sc.nextInt();
    //Approach 1
    int n1 = 0;
    int n2 = 1;
    System.out.println();
    System.out.println("The series is : ");
    System.out.print(n1 + " " + n2 );
    int i = 0;
    while(i < n-2){
      int n3 = n1 + n2;
      System.out.print(" " + n3 );
      n1 = n2 ;
      n2 = n3 ;
      i++;
    }
    System.out.println();
    //Apprach 2
    System.out.println("The Series is : ");
    fibonacci(n);
  }
}
