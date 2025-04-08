public class Problem23 {
  public static void main(String args[]){
    int[] arr = {1, 2, 3, 4, 5, 7};
    int n = arr.length + 1;
    int total = n*(n+1)/2;
    for(int a : arr){
      total -= a;
    }
    System.out.println("The missing element in the array is "+total);
  }
}
