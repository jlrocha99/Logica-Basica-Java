import java.util.Scanner;

public class exc14 {
  public static void main(String[] args) {
    int a, b, aux;
    Scanner input = new Scanner(System.in);

    System.out.println("type 2 numbers: ");
    System.out.print("First number: ");
    a = input.nextInt();
    System.out.print("Second number: ");
    b = input.nextInt();
    aux = a;
    a = b;
    b = aux;

    System.out.println("First number: " + a);
    System.out.print("Second Number: " + b);
  }
}
