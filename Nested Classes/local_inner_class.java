public class local_inner_class {
  private int i = 30 ;
  public void display(){
    //Local inner class
    class local{
      void msg(){
        System.out.println("Local inner class method hello");
      }
    }
    local l = new local();
    l.msg();
  }
  public static void main(String[] args) {
    local_inner_class obj = new local_inner_class();
    obj.display();
  }
}
