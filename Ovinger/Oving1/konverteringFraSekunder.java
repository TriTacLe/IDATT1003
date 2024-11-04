import java.util.Scanner;

public class konverteringFraSekunder {
    public static void main(String[] args) { 
        // 1 sekund = 1 sekund 
        // 1 minutt = 60/1 sekund
        // 1 time = 3600/1 sekund 
    
        Scanner sekundInput = new Scanner(System.in);

        System.out.println("Hvor mange sekunder: ");

        int sekund = sekundInput.nextInt();

        int antallTimer = sekund/3600;
        
        int antallMinutter = sekund%3600/60;

        int antallSekunder =  sekund%3600%60/1;
        
        System.out.println(antallTimer + " timer " + antallMinutter + " Minutter " + antallSekunder + " sekunder ");
    }
}
