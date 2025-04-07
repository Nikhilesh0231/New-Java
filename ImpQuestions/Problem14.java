
import java.util.HashSet;

class Problem14{
  public static void main(String args[]){
    int arr [] = new int[]{1,2,3,4,5,6,6,6,6,7};
    HashSet<Integer> set = new HashSet<>();
    for(int i : arr){
      set.add(i);
    }
    System.out.println(set.size());
    System.out.print(set);
  }
}