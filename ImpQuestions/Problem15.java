///Armstrong number 
/// An Armstrong number is a number that is equal to the sum each digit to the power of its number of digits. For example
/// 
/// 371 is an Armstrong number since 3^3 + 7^3 + 1^3 = 27+343+1=371
public class Problem15 {
  public static void main(String args[]){
    int num = 1634;
    int digits = 0;
    int newnum = num;
    while(num != 0){
      num = num / 10;
      digits++;
    }
    boolean isArmstrong = true;
    int sum = 0;
    int newnum1 = newnum;
    while(newnum1 != 0){
      int digit = newnum1 % 10;
      sum = sum + (int)Math.pow(digit, digits);
      newnum1 = newnum1 / 10;
    }
    if(sum == newnum){
      isArmstrong = true;
    }
    else{
      isArmstrong = false;
    }
    if(isArmstrong == true){
      System.out.println(newnum + " is an Armstrong number");
    }
    else{
      System.out.println(newnum + " is not an Armstrong number");
    }
  }  
}
