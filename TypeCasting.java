class TypeCasting {
  public static void main(String[] args) {
    // Implicit//Widening
    int a = 10;
    long b = a; // Implicitly converted to long
    System.out.println("Value of b: " + b); // Output: 10
    // Explicit//Narrowing
    double num = 12.23;
    int num1 = (int) num; // Explicitly converted to int
    System.out.println("Value of num1: " + num1); // Output: 12
  }
}