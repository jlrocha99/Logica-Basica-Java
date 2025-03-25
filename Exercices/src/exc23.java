import java.util.Locale;
import java.util.Scanner;

public class exc23 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double wage, hourPrice, classesNumber, tax;
    Scanner input = new Scanner(System.in);

    System.out.print("HourPrice: ");
    hourPrice = input.nextDouble();
    System.out.print("Taught classes in 1 month: ");
    classesNumber = input.nextDouble();
    System.out.print("INSS percentage Tax: ");
    tax = input.nextDouble();

    wage = hourPrice * classesNumber;
    tax = (tax / 100) * wage;
    wage -= tax;

    System.out.println("Your wage is: R$" + String.format("%.2f", wage));




  }
}
