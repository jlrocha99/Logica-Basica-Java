import java.util.Scanner;

public class exc01 {
  public static void main(String[] args) {
    int a, b, c;
    Scanner input = new Scanner(System.in);
    System.out.print("Number a: ");
    a = input.nextInt();
    System.out.print("Number b: ");
    b = input.nextInt();
    System.out.print("Number c: ");
    c = input.nextInt();

    if((a + b) >= c) {
      System.out.println("Sum A + B = " + (a + b) + ", is higher or equal than C value");
    }
    else{
        System.out.println("The C value: " + c + ", is higher than A + B result");
    }
  }
}
