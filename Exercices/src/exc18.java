import java.util.Locale;

public class exc18 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    double heightA = 1.50, heightB = 1.10;
    int years = 1;

    while(heightA >= heightB) {
      heightB += 0.03;
      heightA += 0.02;
      years++;

    }
    System.out.println("In " + years + " years" + " Sara is Higher than Francisco");
    System.out.println("Sarah Height: " + String.format("%.2f", heightB) + "m");
    System.out.println("Francisco Height: " + String.format("%.2f", heightA) + "m");

  }
}
