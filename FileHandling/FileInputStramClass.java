import java.io.*;
public class FileInputStramClass {
  public static void main(String[] args) {
    try{
    FileInputStream f1 = new FileInputStream("first.txt");
    // int i = f1.read();
    // System.out.println((char)i);
    int j = 0;
    while((j = f1.read()) != -1){
    System.out.print((char)j);
    }
    f1.close();
    }
    catch(Exception e)
    {
      System.out.println("File not found");
      }

      try {
        FileOutputStream f2 = new FileOutputStream("first.txt");
        String str = "Hello, World!";
        byte[] b = str.getBytes();
        f2.write(b);
        f2.close();
      } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e);
      }
  }
}
