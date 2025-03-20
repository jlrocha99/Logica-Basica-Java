import java.util.Scanner;

public class exc2 {
  public static void main(String[] args) {
    int num;
    Scanner input = new Scanner(System.in);

    System.out.print("Type a number: ");
    num = input.nextInt();

    if(num % 2 == 0) {
      if(num >= 0) {
        System.out.println("the number: " + num + " is even and positive");
      }
      else {
        System.out.println("the number: " + num + " is even and negative");
      }
    }
    else {
      if(num >= 0) {
        System.out.println("The number: " + num + " is odd and positive");
      }
      else {
        System.out.println("the number: " + num + " is odd and negative");
      }
    }
  }
}
