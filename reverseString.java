class reverseString{
  public static void main(String[] args) {
    String str = "Programming";
    String revStr = "";
    for (int i = 0; i < str.length(); i++) {
      revStr = str.charAt(i) +revStr;
    }
    System.out.println(revStr);

    StringBuilder sb = new StringBuilder("Hello");
    sb.reverse();
    System.out.println(sb);
    sb.reverse();

    sb.append("World");
    System.out.println(sb);
    sb.replace(5, sb.length(), "Veeru");
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);
  }
}