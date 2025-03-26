import java.util.Scanner;

public class exc08 {
  public static void main(String[] args) {
    int a, b, c;
    Scanner input = new Scanner(System.in);

    System.out.print("value a: ");
    a = input.nextInt();
    System.out.print("value b: ");
    b = input.nextInt();
    System.out.print("value c: ");
    c = input.nextInt();

    if (a >= b && a >= c) {
      System.out.print("Decreasing order: " + a);
      if (b >= c) {
        System.out.print(" " + b);
        System.out.println(" " + c);
      }
      else {
        System.out.print(" " + c);
        System.out.println(" " + b);
      }
    }
    else if(b >= a && b >= c) {
      System.out.print("Decreasing order: " + b);
      if (a >= c) {
        System.out.print(" " + a);
        System.out.println(" " + c);
      }
      else {
        System.out.print(" " + c);
        System.out.println(" " + a);
      }
    }
    else {
      System.out.print("Decreasing order: " + c);
      if (a >= b) {
        System.out.print(" " + a);
        System.out.println(" " + b);
      }
      else {
        System.out.print(" " + b);
        System.out.println(" " + a);
      }
    }
  }
}
