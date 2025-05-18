class Vehicle{

  public Vehicle(){
    System.out.println("This is Vehicle");
  }

  public void myVehile(){
    System.out.println("This is Method of vehicle class");
  }
}
class Bike extends Vehicle{
  
  public void start(){
    System.out.println("Bike started");
  }
}
public class Example2 {
  public static void main(String[] args) {
    Bike hero = new Bike();
    hero.start();
    hero.myVehile();
}
}