public class Problem13 {
  public static void main(String args[]){
    int arr[] = new int[]{2,3,4,9,8,7,6,5};
    int n = arr.length;
    int largest = arr[0];
    for(int i : arr){
      if(i > largest){
        largest = i;
      }
    }
    System.out.println("Largest element in array is: "+largest);
    int secondLargest = arr[0];
    for(int i : arr){
      if(i > secondLargest && i != largest){
        secondLargest = i;
      }
    }
    System.out.println("Second Largest in the array is : "+secondLargest);
    int thirdlargest = arr[0];
    for(int i : arr){
      if(i>thirdlargest && i < secondLargest ){
          thirdlargest=i; 
      }
    }
    System.out.println("Third Largest of the array is : " +thirdlargest);
  }
}
