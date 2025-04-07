class ownException extends Exception{
  public ownException(String message){
    super(message);
  }
}
public class userDefinedException {
 public static void main(String[] args) {
  try {
      throw new ownException("user defined exception");
  } catch (ownException e) {
    System.out.println("Caught an exception: " + e.getMessage());
  }
 } 
}
