import java.util.Scanner;

public class exc08 {
  public static void main(String[] args) {
    //decreased order
    Scanner input = new Scanner(System.in);
    int aux = 0;
    System.out.print("Type the quantity of numbers that you want to order: ");
    int n = input.nextInt();
    int[] numbers = new int[n];

    //fill
    for (int i = 0; i < numbers.length; i ++) {
      System.out.print("Number(" + (i+1) + "): ");
      numbers[i] = input.nextInt();
    }
    //sort
    for (int i = 0; i < numbers.length; i++) {
      for (int j = 0; j < numbers.length; j++) {
        if(numbers[i] > numbers[j]) {
          aux = numbers[j]; //aux = higher
          numbers[j] = numbers[i];//higher = lower
          numbers[i] = aux; //lower = aux -> higher
        }
      }
    }
    //print
    for (int i = 0; i < 3; i++) {
      System.out.print(numbers[i] + " ");
    }
  }
}
