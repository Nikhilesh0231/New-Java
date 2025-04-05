abstract class Language{
  abstract void Programming();
}

class Java extends Language{
  public void Programming(){
    System.out.println("Programming language is java.");
  }
}
class Python extends Language{
  public void Programming(){
    System.out.println("Programming language is python.");
  }
}
public class abstractClass2 {
  public static void main(String[] args) {
    Java j = new Java();
    Python p = new Python();
    j.Programming();
    p.Programming();
  }  
}
