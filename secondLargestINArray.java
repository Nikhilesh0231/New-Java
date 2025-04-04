
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

class secondLargestINArray{
  public static void main(String[] args) {
    int temp, size;

    int array [] = {23,34,2,1,33,98,67,78};

    size = array.length;
    for (int i = 0; i < size; i++) {
      for (int j = 0; j < size; j++) {
        if(array[i] < array[j]){
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(array));
    System.out.println("Second Largest in the array is : " + array[size - 2]);

    int array2 [] = {23,32,12,34,56,78,95,112,33,55};
    Arrays.sort(array2);
    System.out.println(Arrays.toString(array2));
    System.out.println(array2[array2.length -2]);


    ArrayList<Integer> list = new ArrayList<>();

    list.add(23);
    list.add(34);
    list.add(2);
    
    Collections.sort(list);
    System.out.println(list);
    System.out.println(list.get(list.size()-2));

    LinkedList<Integer> llist = new LinkedList<>();
    llist.add(23);
    llist.addFirst(21);
    llist.addLast(20);
    llist.add(34);
    llist.add(2);
    Collections.sort(llist);
    System.out.println(llist);

    System.out.println(llist.get(llist.size()-2));
    Iterator <Integer> it = llist.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
  
  }
}