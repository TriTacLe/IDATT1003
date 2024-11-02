import java.util.Scanner;

public class oppgave1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Skriv inn tekst: ");
        String tekst = scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Skriv inn bokstav: ");
        String input = scanner1.next();
        char bokstav = input.charAt(0);

        NyString nyString = new NyString(tekst, bokstav); 

        // Kaller på forkorting-metoden og fjerning-metoden o
        String Forkorting = nyString.forkorting(); 
        String Fjerning = nyString.fjerning();   
        
        System.out.println("Originale teksten: " + tekst);
        System.out.println("Teksten etter forkorting: " + Forkorting);
        System.out.println("Teksten etter å ha fjernet bokstaven: " + bokstav + Fjerning);
    }
}
