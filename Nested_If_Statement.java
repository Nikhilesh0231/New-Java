public class Nested_If_Statement {
  public static void main(String[] args) {
    int age = 19;
    boolean isId = false;

    if(age>=18){
      if(isId == true){
        System.out.println("You are eligible to vote");
      } else {
        System.out.println("You are not eligible to vote, you don't have Id");
      }
    } else {
      System.out.println("You are not eligible to vote ,you are minor");
    }
  }
}
 