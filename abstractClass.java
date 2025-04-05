abstract class sample{
  public void display(){
    System.out.println("This is a sample abstract class");
  }
  abstract void getDetails();//we can not give the body of abstract method
}
class abstractClass extends sample{
  public void getDetails() {
    System.out.println("This is a sample abstract class abstract method which is overided here.");
    }
    public static void main(String[] args) {
      // sample s1 = new sample();//We can create instance of abstract class

      abstractClass obj = new abstractClass();
      obj.display();
      obj.getDetails();
    }
}