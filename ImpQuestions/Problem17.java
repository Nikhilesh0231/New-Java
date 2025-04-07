//GCD of two numbers
public class Problem17 {
  public static int findgcd(int a , int b){
    if (b == 0) {
      return a;
    }
    return findgcd(b, a % b);//
  }
  public static void main(String args[]){
    int num1 = 150;
    int num2 = 100;
    //Approach1
    int gcd = findgcd(num1, num2);
    System.out.println("GCD of " + num1 + " and " + num2 + " is : "+gcd);
    //Approach2
    int Nnum1 = num1;
    int Nnum2 = num2;
    while(Nnum2!=0){
      int temp = Nnum2;
      Nnum2 = Nnum1 % Nnum2;
      Nnum1 = temp;
    }
    System.out.println("GCD of " + num1 + " and " + num2 + " is : "+Nnum1);
  }
}
