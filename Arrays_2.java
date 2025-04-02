class Arrays_2{
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5,6,7,8,9,10};
    System.out.println("Looping through an array using for loop.");
    for(int i = 0 ; i < arr.length ; i++){
      System.out.println("Element at " + i + " index is : "+arr[i]);
    }

    System.out.println("Looping through an array using for each loop.");
    for(int i : arr){
      System.out.println("Element is : "+i);
    }
  }
}