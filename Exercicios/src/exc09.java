import java.util.Locale;
import java.util.Scanner;

public class exc09 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double weight, height, imc = 0;
    Scanner input = new Scanner(System.in);

    System.out.print("Weight: ");
    weight = input.nextDouble();
    System.out.print("Height: ");
    height = input.nextDouble();

    imc = weight / (Math.pow(height, 2));

    if(imc <= 18.5) {
      System.out.println("Your IMC is: " + String.format("%.1f", imc) + ", you are in a situation Underweight");
    }
    else if(imc > 18.5 && imc <= 25) {
      System.out.println("Your IMC is: " + String.format("%.1f", imc)  + ", you are in a optimal weight situation");
    }
    else if(imc > 25 && imc <= 30) {
      System.out.println("Your IMC is: " + String.format("%.1f", imc)  + ", you are in a overweight situation");
    }
    else if(imc > 30 && imc <= 40) {
      System.out.println("Your IMC is: " + String.format("%.1f", imc)  + ", you are in a obesity situation");
    }
    else {
      System.out.println("Your IMC is: " + String.format("%.1f", imc)  + ", you are in a situation of severe obesity");
    }

  }
}
