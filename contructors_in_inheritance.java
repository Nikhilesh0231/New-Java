class Parent {
  Parent(){
    System.out.println("Parent Class Constructor");
  }  
}
class Child extends Parent{
  Child(){
    System.out.println("Child Class Constructor");
  }
}
class GrandChild extends Child{
  GrandChild(){
    System.out.println("GrandChild Class Constructor");
  }
}

public class contructors_in_inheritance {
  public static void main(String[] args) {
    System.out.println("Calling Constructor : ");
    System.out.println("Order of Execution.");

    //In Single Level Inheritance
    
    // Child c1 = new Child();



    ///Calling Constructor : 
    /// Order of Execution.
    /// Parent Class Constructor
    //Child Class Constructor

    
    //In Multilevel inheritance
    GrandChild g1 = new GrandChild();


    ///Calling Constructor : 
    /// Order of Execution.
    /// Parent Class Constructor
    ///Child Class Constructor
    ///GrandChild Class Constructor
  }
}
