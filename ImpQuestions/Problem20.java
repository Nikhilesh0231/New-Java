public class Problem20 {
  public static void main(String args[]){
    int start = 1 ,end = 50;
    for(int i=start;i<=end;i++){
      boolean isPrime = true;
      if( i < 2 ) {
        isPrime = false;
      }
      for(int j=2;j<=Math.sqrt(i);j++){
        if( i % j == 0 ){
          isPrime = false;
          break;
        }
      }
      if(isPrime){
        System.out.print(i + " ");
      }
    }

  }
}
