public class Creatingmethod {
  //display method without parmeters and void as return type
  public void displayName(){
    System.out.println("Hello, I am a method");
  }
  //add method with two paremeters and void as return type
  public void add(int num1 ,int num2){
    int sum = num1 + num2;
    System.out.println("Sum is " + sum);
  }
  //multiply method with tow paremeters and int as return type
  public int multiply(int num1,int num2){//num1 and num2 are called as parameters
    int product = num1 * num2;
    return product;
  }
  public static void main(String[] args) {
    //Creating Object of Creatingmethod class
    Creatingmethod obj = new Creatingmethod();
    //calling display method 
    obj.displayName();
    //calling add method
    obj.add(10, 20);//here 10, 20 which is passed as arguments
    //calling and printing the value returned by multiply method
    System.out.println("The Product of 5 and 6 is : " + obj.multiply(5,6));
  }
}
