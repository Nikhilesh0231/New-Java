class Problem6{
  public static void main(String args[]){
    String str = "Nike";
    StringBuilder sb = new StringBuilder(str).reverse();
    System.out.println(sb);

    //String Builder
    StringBuilder sb1 = new StringBuilder();
    String revStr = sb1.append(str).reverse().toString();
    System.out.println(revStr);


    //String Buffer
    StringBuffer sbf = new StringBuffer();
    String strrev = sbf.append(str).reverse().toString();
    System.out.println(strrev);
    
    //Email Checker
    String email = "test@gmail.com";
    if(email.contains("@") && email.contains(".")){
      System.out.println("Valid Email");
      }
      else{
        System.out.println("Invalid Email");
        }
  }
}