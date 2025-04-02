
import java.util.Scanner;

public class Arrays_5_Passing_arrays_to_methods {
  public int max(int []arr){
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }
  public int min(int []arr){
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }
  public static void main(String[] args) {
    Arrays_5_Passing_arrays_to_methods obj1 = new Arrays_5_Passing_arrays_to_methods();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int n = sc.nextInt();
    int []arr1 = new int[n];
    System.out.println("Enter the elements of the array");
    for (int i = 0; i < n; i++) {
      arr1[i] = sc.nextInt();
    }
    System.out.println("Maximum value in the array is : "+obj1.max(arr1));
    System.out.println("Minimum Value in the array is : "+obj1.min(arr1));
    sc.close();
  }
}
