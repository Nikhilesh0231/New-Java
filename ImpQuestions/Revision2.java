import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
class Revision2 {
  public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    int ele2 = list.get(1);
    System.out.println(ele2);
    list.remove(2);
    System.out.println(list);
    list.add(23);
    list.add(12);
    list.add(21);
    System.out.println(list);
    System.out.println(list.size());
    Collections.sort(list);
    System.out.println(list);
    list.set(1,0);
    list.add(3,33);
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);

    LinkedList<String> fruit = new LinkedList<>();
    fruit.add("Apple");
    fruit.add("Orange");
    System.out.println(fruit);
    // fruit.set(1,"Banana");
    fruit.add("Banana");
    fruit.addFirst("Almond");
    fruit.addLast("Water Melon");
    System.out.println(fruit);
    System.out.println(fruit.size());
    Collections.sort(fruit);
    System.out.println(fruit);

    for (String str: fruit) {
      System.out.println(str);
    }


  }  
}
