public class Strings_Method {
  public static void main(String[] args) {
    String str1 = "Hello, World ";
    String str2 = "Welcome to Java Programming";

    //String Concatenation
    // using + Operator
    System.out.println(str1 + str2);
    //using concat method
    System.out.println(str1.concat(str2));
    //charAt() method
    System.out.println(str1.charAt(0));
    System.out.println(str1.charAt(2));
    System.out.println(str1.charAt(4));

    //contains method
    System.out.println(str1.contains("World"));

    //content Equals
    System.out.println(str1.contentEquals("Hello, World"));

    //index of method - it results first occurence of the character or the String if not exists it returns -1
    System.out.println(str1.indexOf("World"));
    System.out.println(str1.indexOf("Hello"));

    String str3 = "";
    //is empty
    System.out.println(str1.isEmpty());
    System.out.println(str3.isEmpty());

    String str5 = "helLo";
    //to upper case
    System.out.println(str5.toUpperCase());
    //to lower case
    System.out.println(str5.toLowerCase());

    String str4 = "       JE       ";
    //trim method
    System.out.println(str4.trim());
  }
}
