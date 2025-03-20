import java.util.Scanner;

public class exc4 {
  public static void main(String[] args) {
    int a;
    Scanner input= new Scanner(System.in);

    System.out.print("Type a number: ");
    a = input.nextInt();

    System.out.println("Previous A number: " + (a - 1));
    System.out.println("Successor A number: " + (a + 1));

  }
}
