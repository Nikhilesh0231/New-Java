class FibonacciSeries{
  public static void Fibonacci(int n1,int n2,int n3 ,int count){
    if(count > 0){
      n3 = n1+n2;
      n1=n2;
      n2=n3;
      System.out.print(" " + n3);
      Fibonacci(n1, n2, n3, count-1);
    }
  }
  public static void main(String[] args) {
    int n1 = 0 ,n2 = 1 ,n3 = 0,count = 10;
    System.out.println("Fibonacci Series : ");
    System.out.print(n1 + " " + n2);
    Fibonacci(n1,n2,n3,count-2);
  }
}