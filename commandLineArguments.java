public class commandLineArguments {
 public static void main(String[] args) {
  if(args.length>0){
    for(String arg : args) {
      System.out.println(arg);
    }
  }
  else{
    System.out.println("No arguments");
  }
 } 
}

//to run such a program in console to pass argument in run time
// PS D:\Java\Java> javac commandLineArguments.java
// PS D:\Java\Java> java commandLineArguments Welcome to Nikhilesh Tiwari code session 

// Output
// Welcome
// to
// Nikhilesh
// Tiwari
// code
// session
