import java.time.LocalDate;
import java.time.Period;

public class exc15 {
  public static void main(String[] args) {
    //Using Java Period class
    LocalDate date1 = LocalDate.of(1999, 12, 7);
    LocalDate date2 = LocalDate.now();

    Period period = Period.between(date1, date2);

    int days = period.getDays();
    int months = period.getMonths();
    int years = period.getYears();

    System.out.println("The different between dates is: " + years + " year(s), " + months + " month(s)" + " and " + days + " day(s)");


  }
}
