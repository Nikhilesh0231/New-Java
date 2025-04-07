public class second {
  public static void main(String[] args) {
    try{
        int[] arr = {1,2,3,4};
        System.out.print(arr[5]);
      }
      catch(Exception e){
        System.out.println("Exception caught" + e);
      }
      finally{
        System.out.println("This is finally block");
      }
      System.out.println("After try-catch-finally");
  }
}
