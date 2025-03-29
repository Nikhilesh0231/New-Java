public class thisKeyword {
  int x ;
   public void display(int x){
    this.x = x ;
   }
  public static void main(String[] args) {
    // Create an instance of the class obj1
    thisKeyword obj1 = new thisKeyword();
    // Call the display method
    obj1.display(10);
    System.out.println("The value of x in first instance of the class is : "+obj1.x);

    // Create an instance of the class obj2
    thisKeyword obj2 = new thisKeyword();
    // Call the display method
    obj2.display(20);
    System.out.println("The value of x in second instance of the class is : "+obj2.x);
  }
}
