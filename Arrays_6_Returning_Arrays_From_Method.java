public class Arrays_6_Returning_Arrays_From_Method {
  public static int[] methodArray(){
    int[] array = {1, 2, 3, 4, 5};
    return array;
  }
  public static void main(String[] args) {
    int n1[] = methodArray();
    for(int i :n1){
      System.out.println(i);
    }
  }
}
