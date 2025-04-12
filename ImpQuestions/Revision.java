class Revision{
  public static void main(String[] args) {
    String name = "Nikhilesh";
    String surname = "Tiwari";
    String full_name = name.concat(surname);
    System.out.println(full_name);
    System.out.println(full_name.length());
    String reverseFull_name = "";
    for(int i = 0 ; i < full_name.length() ; i++){
     reverseFull_name = full_name.charAt(i) + reverseFull_name;
    }
    System.out.println(reverseFull_name);

    String str = " hello ";
    System.out.println(str.trim());
    System.out.print(str.toUpperCase());
    System.out.println(str.toLowerCase());
    System.out.println(str.replace("hello", "world"));
    System.out.println(str.substring(1,5));

    StringBuilder sb = new StringBuilder("noiL");
    System.out.println(sb.reverse());
    sb.append("HEllO");
    System.out.println(sb);
    System.out.println(sb.capacity());
    sb.delete(4,sb.length());
    System.out.println(sb);
    StringBuilder n = new StringBuilder();
    n.append("Lion");
    System.out.println(sb.compareTo(n));

    int num [] = new int[]{2,8,20,3,4,5,6,7};
    printArray(num);
    System.out.println("\nSorted Array is :" );
    printArray((sortArray(num)));
    System.out.println("\n Array is :" );
    printArray((num));
    System.out.println("\nReversed Array is :" );
    printArray((reverseArray(num)));

    System.out.println("\nSum");
    System.out.println(Sum(2));
    System.out.println(Sum(2,3));
    System.out.println(Sum(2,3,72,198));
    System.out.println(Sum(2,3,12,12,12,12,12,12,12143,34212,1212,1212));


    //Factorial 
    System.out.println("Factorial of 5 is " + fact(5));
    System.out.println("Factorial of 0 is " + fact(0));
    System.out.println("Factorial of 1 is " + fact(1));


    System.out.println("The Fibonacci series of length 10 : ");
    fibonacci(10);
    System.out.println();

    //Employeee Class
    Employee emp = new Employee();
    emp.setName("Nikhilesh");
    emp.setAge(25);
    System.out.println("The Name of the Employee is : "+emp.getName());
    System.out.println("The Age of the Employee is : " +emp.getAge());


    //Dog Class
    Dog dog = new Dog();
    dog.display();
    dog.eat();
    dog.sleep();

    //Bull Dog class
    bullDog bullDog = new bullDog();
    bullDog.bullDogMethod();
    bullDog.display();
    bullDog.eat();
    bullDog.sleep();
  }
  public static void printArray(int arr[]){
    for(int i : arr){
      System.out.print(i + " ");
    }
  }
  public static int[] sortArray(int arr[]){
    for(int i = 0 ; i < arr.length ; i++){
      for(int j = i+1 ; j < arr.length ; j++){
       if(arr[i] > arr[j]){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
       }
    }
  }
  return arr;
  }

  public static int[] reverseArray(int arr[]){
    for(int i = 0 ; i < arr.length/2 ; i++){
     int temp = arr[i];
     arr[i] = arr[arr.length-1-i];
     arr[arr.length-1] = temp;
    }
    return arr;
  }

  public static int Sum(int a, int...arr){
    int sum = 0;
    if(arr.length<1){
      sum = a;
    }
    for (int i : arr) {
      sum = sum + i;
    }
    return sum;
  }

  public static int fact(int num){
    if(num == 0||num==1){
      return 1;
    }
    return num * fact(num-1);
  }

  public static void fibonacci(int n){
    int n1 = 0 ,n2 = 1;
    System.err.print(n1+" "+n2);
    int i = 1;
    while(i<=n-2){
      int n3 = n1 + n2;
      n1 = n2;
      n2 = n3;
      System.err.print(" "+n3);
      i++;
    }
  }
}

class Employee{
  private String name;
  private int age;
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }

  public void setName(String name){
    this.name = name;
  }

  public void setAge(int age){
    this.age = age;
  }
}

interface animal{
  public void eat();
  public void sleep();
  default void display(){
    System.out.println("I am an animal");
  }
}
class Dog implements animal{
  public void eat(){
    System.out.println("I am eating");
  }
  public void sleep(){
    System.out.println("I am sleeping");
  }
}

class bullDog extends Dog{
  public void bullDogMethod(){
    System.out.println("I am a bull dog");
  }
}