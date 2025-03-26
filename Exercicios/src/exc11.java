import java.util.Locale;
import java.util.Scanner;

public class exc11 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double[] grades = new double[4];
    double sum = 0;
    String name;
    Scanner input = new Scanner(System.in);

    System.out.print("Name: ");
    name = input.nextLine();
    System.out.println("Type your grades");
    for (int i = 0; i < grades.length; i++) {
      System.out.print("Grade (" + (i+1) +"): ");
      grades[i] = input.nextDouble();
      sum += grades[i];
    }

    System.out.println("Name: " + name);
    if (sum >= 7) {
      System.out.println("Average: " + String.format("%.1f", (sum / grades.length)) + " You are Approved!");
    }
    else {
      System.out.println("Average: " + String.format("%.1f", (sum / grades.length)) + " Reproved");
    }
  }
}
