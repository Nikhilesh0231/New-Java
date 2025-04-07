public class comp{
  public static int max(int a,int b,int c,int d , int e){
    int max = a;
  
    if (b > max) {
      max = b;
    }
    if (c > max) {
      max = c;
    }
    if (d > max) {
      max = d;
    }
    if (e > max) {
      max = e;
    }
    return max; 
  }
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;
    int e = 50;
    int maxres = comp.max(a,b,c,d,e);
      System.out.println("The maximum value is " + maxres);
    }
}


// PS D:\Java\Java\Packages> javac comp.java
// PS D:\Java\Java\Packages> javac -d . comp.java
// PS D:\Java\Java\Packages> java Packages.comp
// The maximum value is 50