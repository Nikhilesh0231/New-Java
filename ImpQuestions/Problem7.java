//Count Vowels and Consonents
class Problem7{
  public static void main(String args[]){
    String str = "HelloWorld";
    int vowels = 0, consonants = 0;
    //Apprach 1
    for(int i = 0; i < str.length(); i++){
      char ch = str.charAt(i);
      if(ch == 'a' || ch == 'A' || ch == 'e' ||ch == 'E' || ch == 'i' ||ch == 'I' || ch == 'u' || ch == 'U' ||ch == 'o'||ch == 'O'){
        vowels++;
      }
      else{
        consonants++;
      }
    }
    System.out.println("The Number of Vowels: " + vowels);
    System.out.println("The Number of Consonants: " + consonants);

    //Approach2
    vowels = 0; 
    consonants = 0;
    for (char c : str.toCharArray()){
      if("aeiouAEIOU".indexOf(c)!=-1){
        vowels++;
      }
      else{
        consonants++;
      }
    }
    System.out.println("The Number of Vowels: " + vowels);
    System.out.println("The Number Of cosonants " + consonants);
  }
}