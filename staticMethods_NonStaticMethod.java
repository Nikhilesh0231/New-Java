class second {
  static void hello(){
    System.out.println("Hello second class static method");
  }
}
public class staticMethods_NonStaticMethod {
  //Non static data member
  int x = 10;
  // static data member
  static int y = 12;
  public static void display(){
    //accessing non static data member in static method
    // System.out.println(x);//we can access non static datamembers in static method

    //accessing static data members in static method
    System.out.println(y);//we can access static data members

    System.out.println("This is a static method");
  }
  public void display1(){
    //accessing non static data member in non-static method
    System.out.println(x);//here we can  access non static datamembers
    System.out.println("This is a non-static method");

    //accessing static data members in non static method
    System.out.println(y);//we can access static data members in non static methods
    }
  public static void main(String[] args) {
    //Calling static methods
    display();
    staticMethods_NonStaticMethod.display();
    //Calling non-static methods
    // display1();//we can not directly call non static methods
    staticMethods_NonStaticMethod s1 = new staticMethods_NonStaticMethod();
    s1.display1();

    //Also we can call static using instance of the class
    staticMethods_NonStaticMethod.display();

    //Calling static methods of second class by class reference
    second.hello();
    //Callin static method second class using instance of the second class
    // second obj = new second();
    // obj.hello();
  }
}
