import java.util.Scanner;

public class exc16 {
  public static void main(String[] args) {
    int l1, l2, l3;
    Scanner input = new Scanner(System.in);
    System.out.println("Type the side of triangles: ");
    System.out.print("L1: ");
    l1 = input.nextInt();
    System.out.print("L2: ");
    l2 = input.nextInt();
    System.out.print("L3: ");
    l3 = input.nextInt();

    if((l1 + l2 > l3) || l1 + l3 > l2 || l2 + l3 > l1) {
      if(l1 == l2 && l2 == l3) {
        System.out.println("Equilateral triangle");
      }
      else if ((l1 != l2 && l2 != l3 && l1!= l3)) {
        System.out.println("Scalene triangle");
      }
      else {
        System.out.println("Isosceles triangle");
      }
    }
    else {
      System.out.println("NOT triangle!");
    }
  }
}
