public class doWhileLoop {
  public static void main(String[] args) {
    int i = 1;
    do { 
        System.out.println(i);
        i++;
    } while (i<=10);


    int arr[] = {2,9,8,2,3};
    int len = arr.length;
    int pass = 0;
    do { 
      int j = 0;
      do { 
          if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          }
          j++;
      } while (j<len-1-pass);        
      pass++;
    } while (pass < len -1);

    //printing array
    System.out.println(len);
    System.out.println("Sorted array will be");
    int k = 0;
    do {
      System.out.println(arr[k]);
      k++;        
    } while (k<len);
  }
}
