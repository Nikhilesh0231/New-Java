import java.util.Scanner;

class Revision4{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("The random number is : "+(int)Math.floor((Math.random()*100)));
    System.out.println("Enter a number to check either no is prime or not : ");
    int number = sc.nextInt();
      boolean isPrime = true;
      if( number < 2 ) {
        isPrime = false;
      }
      for(int j=2;j<=Math.sqrt(number);j++){
        if( number % j == 0 ){
          isPrime = false;
          break;
        }
      }
    if(isPrime){
      System.out.println("Number "+number+" is Prime.");
    }
    else{
      System.out.println("Number "+number+" is not Prime.");
    }


    System.out.println("Enter a number to count the nuber of digits ");
    int num = sc.nextInt();
    int count = 0;
    int orgNum = num;
    while(num != 0){
      num = num/ 10;
      count++;
    }
    System.out.println("Number of digits in "+orgNum+" is "+count);

    System.out.println("Enter a number is Palindrome or not : ");
    int checkNumber = sc.nextInt();
    int reverseNum = 0;
    int originalNum = checkNumber;
    while(checkNumber != 0){
      int remainder = checkNumber % 10;
      reverseNum = (reverseNum * 10) + remainder;
      checkNumber = checkNumber / 10;
    }
    System.out.println(reverseNum);
    if(originalNum == reverseNum){
      System.out.println("Number "+originalNum+" is Palindrome.");
    }
    else{
      System.out.println("Number "+originalNum+" is not Palindrome.");
    }

   }
}