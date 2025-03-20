import java.util.Scanner;

public class exc7 {
  public static void main(String[] args) {
    boolean bool1, bool2;
    Scanner input = new Scanner(System.in);

    System.out.print("Type boolean number: ");
    bool1 = input.nextBoolean();
    System.out.print("Type another boolean number: ");
    bool2 = input.nextBoolean();

    if (bool1 && bool2) {
      System.out.println("values are true");
    }
    else if (!bool1 && !bool2) {
      System.out.println("values are false");
    }
    else {
      System.out.println("values are different");
    }
  }
}
