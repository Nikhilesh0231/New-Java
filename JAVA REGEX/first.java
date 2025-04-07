import java.util.regex.*;

public class first {
  public static void main(String[] args) {
    
    Pattern p = Pattern.compile(".s");
    Matcher m = p.matcher("as");
    boolean b = m.matches(); 
    System.out.println(b);//true

    System.out.println(Pattern.matches("Nikhilesh", "Nikhilesh Tiwari"));//False

    Pattern q = Pattern.compile("nikhilesh");
    Matcher n = q.matcher("nikhilesh Tiwari");
    while(n.find()){
      System.out.println("Pattern found "+n.start() + " to "+(n.end()-1));
    }


    Pattern q1 = Pattern.compile("hi*",Pattern.CASE_INSENSITIVE);
    Matcher n1 = q1.matcher("Hi everyone this is Hit caused high in Highest");
    while(n1.find()){
      System.out.println("Pattern found "+n1.start() + " to "+(n1.end()-1));
    }
    
  }
}
