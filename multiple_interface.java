interface Eat{
  public void eat();
}
interface Speak{
  public void speak();
}
public class multiple_interface implements Eat,Speak {
  @Override
  public void eat() {
    System.out.println("Eating");
  }
  @Override
  public void speak() {
    System.out.println("Speaking");
  }
  public static void main(String[] args) {
      multiple_interface obj = new multiple_interface();
      obj.eat();
      obj.speak();
  }  
}
