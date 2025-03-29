public class MethodOverloading{
  double area (double r){
    double res = 3.14*r*r;
    return res;
  }
  int area(int a){
    int res = a*a;
    return res;
  }
  public static void main(String[] args) {
    MethodOverloading Area = new MethodOverloading();
    System.out.print("Area of circle with radius 5 is: ");
    double circlearea = Area.area(5.1);
    System.out.println(circlearea);
    int squareArea = Area.area(20);
    System.out.print("Area of square with side 20 is: ");
    System.out.println(squareArea);
  }
}