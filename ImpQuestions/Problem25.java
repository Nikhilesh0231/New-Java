
import java.util.ArrayList;

public class Problem25 {
  public static void main(String args[]){
    int num = 6 ;
    ArrayList<Integer> list = new ArrayList<>();
    for(int i = 1 ; i < num ; i++){
      if(num % i == 0){
        list.add(i);
      }
    }
    int sum = 0;
    for(int i = 0 ; i < list.size() ; i++ ){
      sum = sum + list.get(i);
    }

    if(sum == num){
      System.out.println("The number '" + num + "' is Perfect Number.");
    }
    else{
      System.out.println("The number '" + num + "' is not Perfect Number.");
    }
  }
}
