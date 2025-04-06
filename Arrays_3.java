import java.util.Scanner;
public class Arrays_3 {
  public static void main(String[] args) {
    int numOfElement ;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array:");
    numOfElement = input.nextInt();
    int[] array = new int[numOfElement];
    System.out.print("Enter the elements of the array:");
    for(int i = 0; i < numOfElement; i++)
    {
      array[i] = input.nextInt();
    }

    System.out.println("Array Elements are : ");
    for(int i : array){
      System.out.print(i + " ");
    }
    input.close();

  }
}
