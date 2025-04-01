public class Java_Math_Class {
  public static void main(String[] args) {
    //max()
    System.out.println(Math.max(10, 20)); //20
    //min()
    System.out.println(Math.min(10, 20)); //10
    //abs()
    System.out.println(Math.abs(-10)); //10
    //pow()
    System.out.println(Math.pow(2, 3)); //8.0
    //sqrt()
    System.out.println(Math.sqrt(16)); //4.0
    //random()
    System.out.println(Math.random()); //random number between 0.0 and 1.0
    System.out.println(Math.random()*10);
    //floor()
    System.out.println(Math.floor(Math.random()*10));//it generates random value from 1.0 to 10.0
    //ceil()
    System.out.println(Math.ceil(Math.random()*10)); //it generates random value from 1.0 to 10.0
    //round()
    System.out.println(Math.round(Math.random()*10));//It generates random value from 1 to 10
    System.out.println((int)(Math.random()*10));//It generates random value from 1 to 10

  }
}
