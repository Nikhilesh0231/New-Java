public class break_and_continue {
  public static void main(String[] args) {
    for(int i = 1 ; i < 11 ; i++){
      System.out.println(i);
      if(i == 5) {
        System.out.println("Breaked the loop");
        break;
        }
        System.out.println("Loop is running");
    }


    for (int i = 0; i < 10; i++) {
        if (i==2) {
          System.out.println("Continue the loop,skiping 2");
          continue;
        }
        System.out.println(i);
    }
    System.out.println("after Loop");
  }


}
