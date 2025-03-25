import java.util.Scanner;

public class exc20 {
  public static void main(String[] args) {
    int n1, result = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Number: ");
    n1 = input.nextInt();

    for (int i = 1; i <= 10; i++) {
      result = n1 * i;
      System.out.println(n1 + " X " + i + " = " + result);
    }
  }
}
