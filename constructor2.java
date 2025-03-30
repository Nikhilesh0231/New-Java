public class constructor2 {
  int a ;
  //Default constructor
  public constructor2(){
    a = 5;
    System.out.println("The value of a is : " + a);
  }
  //Patameterized Constructor
  public constructor2(int a){
    this.a = a;
    System.out.println("The value of a is : " + a);
  }

  public static void main(String[] args) {
    //calling constructor
    //On creating object of the class constructor called automatically
    constructor2 obj = new constructor2();//it will call default constructor
    constructor2 obj1 = new constructor2(10);//it will call parameterized construtor
  }
}
