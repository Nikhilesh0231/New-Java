//Reversing String
public class Problem1 {
  public static void main(String[] args) {
    ///Approach 1
    String s = "Nikhilesh";
    int length = s.length();
    String revsedString = "";
    for(int i = 0 ; i < length ; i++){
      revsedString = s.charAt(i) + revsedString;
    }
    System.out.println(revsedString);
    ///Approach 2
    StringBuilder sb = new StringBuilder();
    sb.append(s);
    sb.append("Tiwari");
    System.out.println(sb.reverse());
  }
}
