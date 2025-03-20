import java.util.Scanner;

public class exc3 {
  public static void main(String[] args) {
    int a, b, c;
    Scanner input = new Scanner(System.in);
    System.out.print("number 1: ");
    a = input.nextInt();
    System.out.print("number 2: ");
    b = input.nextInt();

    if (a == b) {
      c = a + b;
      System.out.println("A is equals B, A + B = " + c);
    }
    else {
      c = a * b;
      System.out.println("A is different from B, A * B = " + c);
    }

  }
}
