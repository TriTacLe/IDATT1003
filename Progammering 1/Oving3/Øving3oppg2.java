import java.util.Scanner;

/* 
sjekk om tall % alle tallene under seg selv og ikke 1 != 0. Hvis ja er primtall
else ikke primtall

*/

public class Øving3oppg2 {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);

        int tall;

        do {
            System.out.println("Skriv inn et positivt heltall større enn 1 for primtallsjekk: ");
            while (!myObj.hasNextInt()) {
                System.out.println("Ugyldig inndata! Vennligst skriv inn et heltall.");
                myObj.next(); // sletter feil input
            }
            tall = myObj.nextInt();
        } while (tall <= 1); // Sørger for at brukeren skriver et tall større enn 1

        int teller = 0;

        if (tall == 2);
            System.out.println(tall +  " er et primtall");

        for (int count = tall-1; count > 1; count--){ //kjører løkken fra count er 1 mindre enn tallet helt til count er større enn 1            

            if (tall % count != 0){
                
                teller = teller + 1;

                if (teller == tall-2){
                    System.out.println(tall + " er et primtall");
                }
                continue;                
            } else if (tall % count == 0) {
                System.out.println(tall + " er ikke et primtall");
                break;
            }
        }    
    }          
}