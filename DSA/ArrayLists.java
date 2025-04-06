import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
  public static void main(String[] args) {
    // Create an ArrayList
    ArrayList<Integer> list = new ArrayList<>();
    // Add elements to the ArrayList
    list.add(2);
    list.add(4);
    list.add(6);
    ///printing ArrayList
    System.out.println(list);
    //get Element
    int el1 = list.get(0);
    int el2 = list.get(1);
    System.out.println("The first element of the list is " + el1 + " and the second element of the list is "+el2);

    //Adding element at the specified index
    list.add(1, 10);
    System.out.println(list);
    //Setting element at specified position
    list.set(0, 20);
    System.out.println(list);
    //delete element at any index
    list.remove(0);
    System.out.println(list);
    list.remove(0);
    System.out.println(list);

    //size of the list 
    int size = list.size();
    System.out.println("The size of the list is " + size);

    //Iterating over an List
    list.add(8);
    list.add(10);
    list.add(12);
    list.add(14);
    list.add(0,2);
    size = list.size();
    for (int i = 0; i < size; i++) {
      System.out.println("Element at index " + i + " is " + list.get(i));
    }
    list.add(0,20);
    list.add(0,22);

    System.out.println(list);
    //Sorting list in Asscending Order
    //But it didn't work for arrays
    Collections.sort(list);
    System.out.println(list);

    //Sum of all element in the list
     int sum = 0;
     for (int i = 0; i < list.size(); i++) {
      sum = sum + list.get(i);
     }
     System.out.println("The sum of the element of the list is : "+sum);
  }
}
