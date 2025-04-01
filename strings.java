public class strings {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = "World";
    String s3 = s1 + " " + s2;
    System.out.println(s3);

    String revStr = "";
    for(int i = s1.length()-1 ; i >= 0 ; i--){
      // System.out.println(s1.charAt(i));
      revStr = revStr + s1.charAt(i);
    }
    System.out.println(revStr);

    String str4 = "H e l l o";

    String str5 = "";
    int strLen = 0;
    for(int i = 0 ; i < str4.length() ; i++){
      if(str4.charAt(i) == ' '){
        continue;
      }
      str5 = str5 + str4.charAt(i);
      strLen++;
    }
    System.out.println(str5);
    System.out.println(strLen);//It did not counts spaces in the string 
  } 
}
