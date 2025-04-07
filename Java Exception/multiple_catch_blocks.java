public class multiple_Catch_blocks {
  public static void main(String[] args) {
    try {
        int a[] = new int[5];
        // a[5] = 30/0;
        // System.out.println(a[6]);
        String s = null;
        System.out.println(s.length());
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception caught"+e);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Array Index Out of Bounds Exception caught"+e);
    }
    catch(Exception e){
      System.out.println("General Exception caught");

    }
    System.out.println("Rest");
  }
}
