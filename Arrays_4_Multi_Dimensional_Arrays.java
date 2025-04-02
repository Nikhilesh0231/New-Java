public class Arrays_4_Multi_Dimensional_Arrays {
  public static void main(String[] args) {
    int arr[][]={{1,2,3,4},{5,6,7,8}};
    for(int i = 0 ; i < arr.length ; i++){
      for(int j = 0 ; j < arr[i].length ; j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println("The Length of the first row : "+arr[0].length);
    System.out.println("The Length of the second row : "+arr[1].length);
  }
}
