public class ArraySorting_USing_whileLoop {
  public static void main(String[] args) {
      int[] array = {5, 2, 8, 1, 9};
      int n = array.length;
      int pass = 0;

      // Bubble Sort using while loop
      while (pass < n - 1) { // Outer loop for passes
          int i = 0;
          while (i < n - 1 - pass) { // Inner loop for comparisons
              if (array[i] > array[i + 1]) {
                  // Swap elements
                  int temp = array[i];
                  array[i] = array[i + 1];
                  array[i + 1] = temp;
              }
              i++;
          }
          pass++;
      }

      // Print sorted array using while loop
      int i = 0;
      while (i < n) {
          System.out.println(array[i]);
          i++;
      }
  }
}
