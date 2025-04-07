//Reversing a Number
public class Problem16 {
  public static void main(String args[]){
    int num = 12345;
    int reverse = 0;
    while (num!=0) { 
        int remainder = num % 10;
        reverse = reverse * 10 + remainder;
        num = num / 10;
    }
    System.out.println("Reverse of the number is: " + reverse);
  }
}
