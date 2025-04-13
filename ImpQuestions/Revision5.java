import java.util.HashMap;

class Revision5 {
  public static void main(String args[]){
    HashMap<String,String> list = new HashMap<>();
    list.put("A","Apple");
    list.put("B","Banana");
    list.put("C","Cherry");
    System.out.println(list.get("A"));
    list.remove("A");
    System.out.println(list);
    for(String i : list.keySet()){
      System.out.println(i);
    }
    for(String i : list.keySet()){
      System.out.println(list.get(i));
    }
  }  
}
