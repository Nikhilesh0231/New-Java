import java.util.Scanner;
class patientInformation{
  final private String name;
  final private int age;

  patientInformation(String name,int age){
    this.name = name;
    this.age = age;
  }
   
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
}
class first{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter age : ");
    int age = sc.nextInt();
    System.out.print("\n Enter your name : ");


    String name = sc.next();
    System.out.print("If you admin write yes either no : ");
    String admin = sc.next();
    sc.close();


    int validAge = 1;
    if(age<1){
      System.out.println("Invalid age");
    }
    else{
      validAge = age;
    }
    patientInformation obj = new patientInformation(name,validAge);
    boolean isAdmin;
    if(admin.equalsIgnoreCase("yes")){
      isAdmin = true;
    }
    else{
      isAdmin = false;
    }
    if (isAdmin == true) {
    System.out.println(obj.getName());
    System.out.println(obj.getAge());
    }
    else{
      System.out.println("You are not an admin");
    }
  }
}