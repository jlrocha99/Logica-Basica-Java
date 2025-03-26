import java.util.Locale;
import java.util.Scanner;

public class exc05 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double salary, baseSalary;
    Scanner input = new Scanner(System.in);
    System.out.print("Type a base salary value: ");
    baseSalary = input.nextDouble();
    System.out.print("Type your Salary: ");
    salary = input.nextDouble();
    System.out.println("Base salary is: " + String.format("%.2f", baseSalary));
    System.out.println("You receive: " + String.format("%.2f", salary / baseSalary) + "x of a Base Salary");



  }
}
