import java.util.*;
public class Standardinputoutput {
  public static void main(String[] args) {
    // Read input from the user
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name:");
    String name = scanner.nextLine();
    System.out.println("Hello, " + name + "!");
    System.err.println("This is error");
    scanner.close();
  }
}
