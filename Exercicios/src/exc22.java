import java.util.Scanner;

public class exc22 {
  public static void main(String[] args) {
    int n1, n2;
    Scanner input = new Scanner(System.in);

    System.out.print("Number 1: ");
    n1 = input.nextInt();
    System.out.print("Number 2: ");
    n2 = input.nextInt();

    System.out.println("Quotient:  " + (n1 / n2));
    System.out.println("Remainder: " + (n1 % n2));
  }
}
