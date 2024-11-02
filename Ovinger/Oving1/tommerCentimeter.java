import java.util.Scanner;

class tommerCentimeter {
  public static void main(String[] args) {

    Scanner tommerInput = new Scanner(System.in);

    System.out.println("Hvor mange tommer: ");
    
    double tommer = tommerInput.nextDouble();

    double centimeter = 2.54 * tommer;

    System.out.println(tommer + " tommer er " + centimeter + " centimeter.");

  }
}