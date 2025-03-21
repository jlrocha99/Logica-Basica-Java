import java.util.Scanner;

public class exc13 {
  public static void main(String[] args) {
    String name;
    int age;
    Scanner input = new Scanner(System.in);

    System.out.print("Name: ");
    name = input.nextLine();
    System.out.print("Age: ");
    age = input.nextInt();

    System.out.println();
    System.out.println("Name: " + name);
    if(age >= 18) {
      System.out.println(age + "yo you are an adult");
    }
    else {
      System.out.println(age + "yo you are NOT an adult");
    }
  }
}
