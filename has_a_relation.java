class Author{
  String authorName;
  String place;
  int age;
  public Author(String authorName, String place, int age) {
    this.authorName = authorName;
    this.place = place;
    this.age = age;
  }
}
class Book {
 String title;
 Author author;
 int price;
 public Book(String title, Author author, int price) {
  this.title = title;
  this.price = price;
  this.author = author;
 }  
}
public class has_a_relation {
  public static void main(String[] args) {
    Author author = new Author("Nikhilesh","Gurgaon",22);
    Book book = new Book("Java Programming", author, 500);
    System.out.println("Book name : "+book.title);
    System.out.println("Book price is : "+book.price);
    System.out.println("Book author name is : "+book.author.authorName);
    System.out.println("Book author age is : "+book.author.age);
  }
}
