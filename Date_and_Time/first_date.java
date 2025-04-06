import java.util.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class first_date {
  public static void main(String[] args) {
    Date d = new Date();
    //It returns current time in 'Mon Apr 07 00:26:17 IST 2025' this format
    System.out.println(d);
    String currDate = d.toString();
    System.out.println(currDate);

    LocalDate my = LocalDate.now();
    //It return currDate like '2025-04-07'
    System.out.println(my);

    LocalTime myTime = LocalTime.now();
    //It return currTime like '00:26:17.123'
    System.out.println(myTime);

    LocalDateTime myDateTime = LocalDateTime.now();
    //It return currDate and currTime like '2025-04-07T00:41:23.076626700
    System.out.println("Before formating");
    System.out.println(myDateTime);

    System.out.println("After formating");
    DateTimeFormatter myfor = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    System.out.println(myDateTime.format(myfor));

  }
}
