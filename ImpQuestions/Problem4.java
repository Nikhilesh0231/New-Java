public class Problem4 {
  public static void main(String[] args) {
    //Palingrome String 
    String str = "madam";
    String rev = new StringBuilder(str).reverse().toString();
    if(str.equals(rev))
    {
    System.out.println("The string is a palindrome");
    }
    else
    {
      System.out.println("The string is not a palindrome");
    }

    //Approach2
    String str2 = "radar";
    boolean isPalindrome = true;
    for(int i = 0 ; i < str2.length()/2 ; i++)
    {
      if(str2.charAt(i) != str2.charAt(str2.length()-1-i))
      {
        isPalindrome = false;
      }
    }
    if(isPalindrome)
    {
      System.out.println("The string is a palindrome");
    }
    else {
      System.out.println("The string is not a palindrome");
    }

    //Checking for a palinfrome Number 
    int num = 121;
    int revNum = 0;
    int originalNum = num;
    while(num != 0)
    {
    int remainder = num % 10;
    revNum = revNum * 10 + remainder;
    num = num / 10;
    }
      if(originalNum == revNum)
      {
      System.out.println("The number is a palindrome");
      }
      else
      {
        System.out.println("The number is not a palindrome");
      }
  }
}
