class Problem21{
  public static void main(String args[]){
    int arr[] = new int[]{2,3,4,5,12,43,42,12,23};
    int max = Integer.MIN_VALUE;
    int secMax = Integer.MAX_VALUE;
    for(int el : arr){
      if(el > max){
        secMax = max;
        max = el;
      }else if(el>secMax && el != max){
        secMax = el;
      }
    }
    System.out.println("Second Maximum Element is: "+secMax);

  }
}