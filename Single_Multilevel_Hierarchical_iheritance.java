//Single inheritance
class Animal{
  public void eat(){
    System.out.println("Eating...");
  }
}
class Dog extends Animal{
  public void bark(){
    System.out.println("Barking...");
  }
}

//Multilevel Inheritance
class Phone{
  public void ring(){
    System.out.println("Ringing...");
  }
  public void call(){
    System.out.println("Calling...");
  }
}
class MultimediaPhone extends Phone{
  public void playMusic(){
    System.out.println("Playing Music...");
  }
}
class AndroidPhone extends MultimediaPhone{
  public void installApp(){
    System.out.println("Installing App...");
  }
  public void GoogleSearch(){
    System.out.println("Google Search...");
  }
}

//Heirarchical Inheritance
class Base1{
  public void display1() {
    System.out.println("Base1");
  }
}
class Derived1 extends Base1{
  public void display2() {
    System.out.println("Derived 1");
  }
}
class Derived2 extends Base1 {
  public void display3() {
    System.out.println("Derived 2");
  }
}


public class Single_Multilevel_Hierarchical_iheritance {
  public static void main(String[] args) {  
    System.out.println("Single level inheritance");  
    Dog d1 = new Dog();
    d1.eat();
    d1.bark();

    System.out.println("Multilevel Inheritance");
    AndroidPhone a = new AndroidPhone();
    a.ring();
    a.call();
    a.playMusic();
    a.installApp();
    a.GoogleSearch();

    System.out.println("Hierarchical Inheritance");
    Base1 b1 = new Base1();
    b1.display1();
    Derived1 d = new Derived1();
    d.display1();
    d.display2();
    Derived2 d2 = new Derived2();
    d2.display1();
    d2.display3();
  }
}
