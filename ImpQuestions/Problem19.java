public class Problem19 {
  public static void main(String args[]){
    int num = 12345;
    numberofDigits(num);
  }
  public static void numberofDigits(int num) {
    int count = 0;
    int orgNum = num;
    while(num != 0){
      num = num / 10;
      count++;
    }
    System.out.println("The number of digit in " +orgNum+" is : "+count );
  }
}
