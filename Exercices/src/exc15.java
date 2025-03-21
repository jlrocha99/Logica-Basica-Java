import java.time.LocalDate;
import java.util.Scanner;

//Not finished
public class exc15 {
  public static void main(String[] args) {
    int year, month, day;
    LocalDate actualDate = LocalDate.now();
    int actualYear, actualMonth, actualDay;
    actualYear = actualDate.getYear();
    actualMonth = actualDate.getMonthValue();
    actualDay = actualDate.getDayOfMonth();

    Scanner input = new Scanner(System.in);
    System.out.println(actualDate);

    System.out.println("Type your date birth");
    System.out.print("Year: ");
    year = input.nextInt();
    System.out.print("Month: ");
    month = input.nextInt();
    System.out.print("Day");
    day = input.nextInt();


    day = actualDay >= day ? (actualDay - day) : (day - actualDay);

    year = actualYear - year;
    month = actualMonth;
    System.out.println("You lived: " + year + " years, " + month + " month(s)" + " and " + day + " days");


  }
}
