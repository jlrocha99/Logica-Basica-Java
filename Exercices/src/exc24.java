import java.util.Locale;
import java.util.Scanner;

public class exc24 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    double time, speed, space, fuel;
    Scanner input = new Scanner(System.in);
    System.out.print("Time travel (h): ");
    time = input.nextDouble();
    System.out.print("Average Speed (km/h): ");
    speed = input.nextDouble();

    space = time * speed; //km
    fuel = space / 12;

    System.out.println("Will be necessary: " + String.format("%.1f", fuel) + "L" + " to complete the travel");
  }
}
