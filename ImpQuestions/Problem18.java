//Check for the Anagram in this we can check for each charcter is present in both the String 
import java.util.Arrays;
class Problem18{
  public static void main(String args[]){
    String str1 = "tac";
    String str2 = "act";
    char [] arr1 = str1.toCharArray();
    char [] arr2 = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    if(Arrays.equals(arr1,arr2)){
    System.out.print("Both the String are Anagram");
    } else {
      System.out.print("Both the String are not Anagram");
    }
  }
}