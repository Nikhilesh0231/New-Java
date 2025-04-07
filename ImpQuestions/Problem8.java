class Problem8{
  public static void main(String args[]){
    String newStr = "madam";
    String str = newStr.toLowerCase();
    String revStr = new StringBuilder(str).reverse().toString();
    if(str.equals(revStr)){
      System.out.println("The string is a palindrome");
    }
    else{
      System.out.println("The string is not a palindrome");
    }

    int num = 12321;
    int revnum = 0;
    int orgnum = num;
    while(num!=0){
      int rem = num%10;
      revnum = revnum*10 + rem ;
      num = num/10;
    }
    if(revnum == orgnum){
      System.out.println("The number is a palindrome");
    }
    else{
      System.out.println("The number is not a palindrome");
    }
  }
}