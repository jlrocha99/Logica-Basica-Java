import java.util.Locale;
import java.util.Scanner;

public class exc10 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double a, b, c;
    Scanner input = new Scanner(System.in);
    System.out.print("Grade a: ");
    a = input.nextDouble();
    System.out.print("Grade b: ");
    b = input.nextDouble();
    System.out.print("Grade c: ");
    c = input.nextDouble();

    System.out.println("Your school average is: " + String.format("%.2f", (a + b + c) / 3));
  }
}
