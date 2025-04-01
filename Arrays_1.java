public class Arrays_1 {
  public static void main(String[] args) {
    //Array Declaration
    int array1[] = new int[10];//here we had declared an array with name array1 and size will be 10
    //giving values to individual elements 
    array1[0] = 10;
    array1[1] = 20;
    array1[2] = 30;
    ///accessing array individual Element
    System.out.println(array1[3]);//by default 0 value is stored
    System.out.println(array1[2]);//30
    //Giving value at the time of declaration
    int array2[] = new int[]{2,4,5,6,7,8,9};
    //accessing array2 elements
    System.out.println(array2[0]);//2

    // one more simpler way to declare the array

    String strArray[] = {"Hello","Hi","Hey"};

    System.out.println(strArray[0]);



    //To Know the length of the array
    System.out.println("The Length of the array2 is "+array2.length);

    //Changing the value of an array element
    array2[0] = 10;
    System.out.println(array2[0]);
  }
}