class Animal{
  String name = "";
  //Default Constructor
  Animal(){
    System.out.println("Animal is created");
  }
  //Parameterized Constructor
  Animal(String Name){
    this.name = Name;
  }
  //Eat Method return type is void
  public void eat(){
    System.out.println(name + " is eating....");
  }
  //Sleep Method
  public void sleep(){
    System.out.println(name + " is sleeping....");
  }
}
class Example1{
  public static void main(String args []){
    //Object intilization
    Animal dog = new Animal("Dog");
    //Method call
    dog.eat();
    dog.sleep();
    Animal cat = new Animal("Cat");
    cat.eat();
    cat.sleep();
    Animal a1 = new Animal();
  }
}