public class MethodsP2 {
  public void displayInformation(String ename,int eage){
    System.out.println("Employee Name: "+ename);
    System.out.println("Employee Age: "+eage);
  }
  public static void main(String[] args) {
    MethodsP2 e1 = new  MethodsP2();
    e1.displayInformation("Rahul",25);
    MethodsP2 e2 = new MethodsP2();
    e2.displayInformation("Nikhilesh",22);
  }
}
