import com.sun.management.GcInfo;
import java.util.*;
class GregorianCalender{
  public static void main(String[] args) {
    String months[] = {"Jan","feb","Mar","Apr","May","June","Jul","Aug","Sep","Oct","Nov","Dec"};
    int year;
    GregorianCalendar gCalender = new GregorianCalendar();
    System.out.print("Date : ");
    System.out.print(months[gCalender.get(Calendar.MONTH)]);
    System.out.print(" " + gCalender.get(Calendar.DATE));
    System.out.print(" " + gCalender.get(Calendar.YEAR));
    System.out.println();
    System.out.print("Time -> ");
    System.out.print(gCalender.get(Calendar.HOUR) + ":" );
    System.out.print(gCalender.get(Calendar.MINUTE) + ":");
    System.out.println(gCalender.get(Calendar.SECOND));

    //Check for Leap Year
    if (gCalender.isLeapYear(gCalender.get(Calendar.YEAR))) {
      System.out.println("This is a leap year");
      } else {
        System.out.println("This is not a leap year");
        }
  }
}