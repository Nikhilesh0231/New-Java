public class Problem27 {
  public static void main(String args[]){
    //////////////////////////////////////////////////////////////////////////////////
    
    int num = 123456;
    int digitCount = 0;
    int orgNum = num;
    while(num!=0){
      digitCount++;
      num = num/10;
    }
    System.out.println("Number of digits in the number "+orgNum+" is "+digitCount);

    //////////////////////////////////////////////////////////////////////////////////
    
    String str = "Automation";
    System.out.println("The lenght of the String '"+str+"' is : "+str.length());

    //////////////////////////////////////////////////////////////////////////////////

    String str2 = "";
    if(str2.isEmpty()){
      System.out.println("The String is empty");
    }
    else{
      System.out.println("The String is not empty");
    }

    /////////////////////////////////////////////////////////////////////////////////////
    
    String str3 = "Programming";
    char ch = 'P';
    if(!Character.isLowerCase(ch)){
      ch = Character.toLowerCase(ch);
    }
    System.out.println(ch);
    int count = 0;
    for(int i=0;i<str3.length();i++){
      if(str3.toLowerCase().charAt(i)==ch){
        count++;
      }
    }
    System.out.println("The character '"+ch+"' appears "+count+" times in the String '"+str3);
  }
}
