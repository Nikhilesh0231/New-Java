
class forrLoop {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);

        //sorting an array
        int[] arr = {5, 2, 8, 1, 9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        //Sum of even numbers from 1 to 20 

        int sumOfEvenNum = 0;
        for(int i = 1 ; i < 21 ; i++ ){
          if(i % 2 == 0){
            sumOfEvenNum += i ;
          }
        }         
        System.out.println(sumOfEvenNum);
    }
}
