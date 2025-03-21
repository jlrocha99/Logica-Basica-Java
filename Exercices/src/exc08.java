import java.util.Scanner;

//Not finished
public class exc08 {
  public static void main(String[] args) {
    int aux = 0;
    int[] numbers = new int[3];
    Scanner input = new Scanner(System.in);

    System.out.println("Type 3 numbers: ");
    //fill
    for (int i = 0; i < 3; i ++) {
      numbers[i] = input.nextInt();
    }
    //2  3  5
    aux = numbers[0]; //2
    //sort
    for (int i = 0; i < 3; i++) {
      if(aux < numbers[i]) {
        numbers[i] = aux;
        numbers[i-1] = numbers[i];
      }
    }
    //print
    for (int i = 0; i < 3; i++) {
      System.out.println(numbers[i]);
    }

  }
}
