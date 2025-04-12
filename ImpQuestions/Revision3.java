public class Revision3 {
  public static void main(String[] args) {
    int arr[] = new int[]{23,43,44,21,56,76,45,87,54,98,65};
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < arr.length ; i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    System.out.println(max);

    int firstmax = Integer.MIN_VALUE;
    int secondmax = Integer.MIN_VALUE;
    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i]>firstmax){
        secondmax = firstmax;
        firstmax = arr[i];
      } else if (arr[i] > secondmax && arr[i] != firstmax){
        secondmax = arr[i];
      }
    }
    int thirdmax = Integer.MIN_VALUE;
    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i]>thirdmax && ( arr[i] != secondmax && arr[i] != firstmax )){
        thirdmax = arr[i];
      }
    } 
    System.out.println("First max is " + firstmax);
    System.out.println("Second max is "+secondmax);
    System.out.println("Third max is "+thirdmax);
  }
}
