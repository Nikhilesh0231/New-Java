public class Problem9 {
  public static void main(String args[]){
    int n = 10 , n1 = 0 , n2 = 1 ; 
    System.out.println("First " + n + " Fibonacci numbers are:");
    System.out.print(n1+" "+n2);
    for(int i = 2 ; i < n ; i++){
      int n3 = n1 + n2 ;
      System.out.print(" "+n3);
      n1 = n2;
      n2 = n3;
    }
    int fact = 1;
    for(int i = 1 ; i <= n ; i++){
      fact = fact * i;
    }
    System.out.println("\nFactorial of " + n + " is: " + fact);
  }
}
