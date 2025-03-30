public class variable_Arguments {
  public int sum (int ... args){
    System.out.println("Arguments Length : "+args.length);
    int sum = 0 ;
    for (int i : args) {
      sum += i ;
    }
      return sum ;
  }
  public static void main(String[] args) {
    variable_Arguments va = new variable_Arguments();
    System.out.println("Sum with 2 arguments : "+va.sum(1,2));
    System.out.println("Sum with 3 arguments : "+va.sum(1,2,4));
    System.out.println("Sum with 4 arguments : "+va.sum(1,2,4,12));    
  }
}
