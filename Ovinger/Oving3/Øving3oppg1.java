import java.util.Scanner; 

public class Øving3oppg1 {
    public static void main(String[] args) {
        //gangetabell fra 13 til 15
        
        Scanner myObj = new Scanner(System.in);

        System.out.println("Hvor mange ganger vil du bruke gangetabellen: ");
        
        int antall = myObj.nextInt();

        for (int p = 0; p<= antall; p++){
            System.out.println("Hvilket tall vil du ha gange tabellen til?: ");
            
            int tall = myObj.nextInt();

            for (int i = 1; i <= 10; i++) {
                int produkt = tall * i;
                System.out.println(tall + " x " + i + " = " + produkt);            
            }   
        }
        System.out.println("Ferdig");
    }
}
