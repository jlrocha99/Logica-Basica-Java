import java.util.Locale;
import java.util.Scanner;

public class exc6 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double value;
    Scanner input = new Scanner(System.in);
    System.out.print("Type a value: ");
    value = input.nextDouble();

    System.out.println("Your value was readjusted in 5% and the new value is: " + String.format("%.2f", (value * 1.05 )));

  }
}
