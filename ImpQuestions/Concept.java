import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
public class Concept {
  public static void main(String args []){
    int arr [] = new int[]{2,42,12,23,34,45,56};
    int arr1 [] = new int[]{2,42,12,23,34,45,56};
    // Arrays.sort(arr);
    // System.out.println(Arrays.toString(arr));
    System.out.println(arr.length);
    System.out.println(Arrays.compare(arr, arr1));
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(34);
    list.add(45);
    list.add(33);
    Collections.sort(list);
    System.out.println(list);
    Collections.reverse(list);
    System.out.println(list);
    int secondLargest = list.get(1);
    System.out.println(secondLargest);
    System.out.println(list.size());
    list.remove(3);
    System.out.println(list);
    list.set(0,65);
    System.out.println(list);



    LinkedList<Integer> list1 = new LinkedList<>();
    list1.add(1);
    list1.addFirst(0);
    list1.add(23);
    list.add(45);
    list1.addLast(34);
    
    HashMap<String ,String> list3 = new HashMap<>();
    list3.put("a","1");
  }
}
