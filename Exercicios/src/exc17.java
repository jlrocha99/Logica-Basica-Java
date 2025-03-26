import java.util.Locale;
import java.util.Scanner;

public class exc17 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double celsius, fahrenheit;
    Scanner input = new Scanner(System.in);

    System.out.print("Temperature in Fahrenheit: ");
    fahrenheit = input.nextDouble();
    celsius = 5 * ((fahrenheit - 32) / 9);


    System.out.println("Fahrenheit: " + String.format("%.1f", fahrenheit) + "°F");
    System.out.println("Celsius: " + String.format("%.1f", celsius) + "°C");

  }
}
