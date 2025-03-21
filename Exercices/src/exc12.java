import java.util.Locale;
import java.util.Scanner;

public class exc12 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner input = new Scanner(System.in);
    int n = 0;
    double sum = 0;
    int payment;
    double finalValue;
    System.out.print("Enter the amount of products: ");
    n = input.nextInt();
    double[] productPrice = new double[n];
    String[] productName = new String[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Product name: ");
      input.nextLine();
      productName[i] = input.nextLine();
      System.out.print("Product price: ");
      productPrice[i] = input.nextDouble();

      sum += productPrice[i];
    }

    System.out.println();
    System.out.println("Payments code table");
    System.out.println("(1)-Cash payment or pix, 15% off");
    System.out.println("(2)-Cash on credit card. 10% off");
    System.out.println("(3)-Installment up 2 times,  Normal Price");
    System.out.println("(4)-Installment on credit card 3 times or more, Normal price + 10% interest");
    System.out.println();
    System.out.print("Payment form: ");
    payment = input.nextInt();

    System.out.println();
    switch(payment) {
      case 1:
        System.out.println("Payment form: Cash payment or pix");
        finalValue = sum - (sum * 0.15);
        System.out.println("Total value is: " + "R$" + String.format("%.2f", finalValue));
        break;
      case 2:
        System.out.println("Payment form: Cash on credit card");
        finalValue = sum - (sum * 0.10);
        System.out.println("Total value is: " + "R$" + String.format("%.2f", finalValue));
        break;
      case 3:
        System.out.println("Payment form: Installment up 2 times");
        finalValue = sum;
        System.out.println("Total value is: " + "R$" + String.format("%.2f", finalValue));
        break;
      case 4:
        System.out.println("Payment form: Installment on credit card 3 times or more");
        finalValue = sum + (sum * 0.10);
        System.out.println("Total value is: " + "R$" + String.format("%.2f", finalValue));
        break;

      default:
        System.out.println("Incorrect value!");
    }

    System.out.println("List of products");
    for (int i = 0; i < n; i++) {
      System.out.println("-" + productName[i] + ", " + "R$" + String.format("%.2f", productPrice[i]));
    }
  }
}
