import java.util.Scanner;

public class Oppgave1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean avslutt = false;

        while (!avslutt) {
            System.out.println("");
            System.out.println("Velg valuta:");
            System.out.println("1: dollar");
            System.out.println("2: euro");
            System.out.println("3: svenske kroner");
            System.out.println("4: avslutt");

            int valg = scanner.nextInt();

            if (valg == 4){
                System.out.println("Avslutter programmet");
                avslutt = true;
                break;
            }
            System.out.println("1 for nok til valuta, 2 for valuta til nok");
            int valg1 = scanner.nextInt();

            switch (valg) {
                case 1:
                    if (valg1 == 1) {
                        System.out.println("Antall nok: ");
                        double antall = scanner.nextDouble();

                        Valuta dollar = new Valuta(antall); //lager en objekt dollar av klassen valuta med parameter
                        dollar.konvertering_dollar(); //kaller på metoden
                    } else {
                        System.out.println("Antall dollar: ");
                        double antall = scanner.nextDouble();

                        Valuta nok = new Valuta(antall); //lager objekt nok av klassen valuta
                        nok.konvertering_dollar_nok(antall); //kaller på metode
                    }
                    break;
                case 2:
                    if (valg1 == 1) {
                        System.out.println("Antall nok: ");
                        double antall = scanner.nextDouble();

                        Valuta euro = new Valuta(antall); //lager en objekt euro av klassen valuta
                        euro.konvertering_euro(); //kaller på metoden som kjører konverteringen av nok til euro
                    } else {
                        System.out.println("Antall euro: ");
                        double antall = scanner.nextDouble();

                        Valuta nok = new Valuta(antall); //objekt
                        nok.konvertering_euro_nok(antall); //kaller på metoden
                    }
                    break;
                case 3:
                    if (valg1 == 1) {
                        System.out.println("Antall nok: ");
                        double antall = scanner.nextDouble();

                        Valuta sek = new Valuta(antall); //lager en objekt sek av klassen valuta
                        sek.konvertering_sek(); //kaller på metoden
                    } else {
                        System.out.println("Antall sek: ");
                        double antall = scanner.nextDouble();

                        Valuta nok = new Valuta(antall);//objekt
                        nok.konvertering_sek_nok(antall);//kaller på metode
                    }
                    break;
            }
        }
        //Valuta euro = new Valuta(20); 
        //Valuta sek = new Valuta(20); 
        
        //kaller på metoden
        //konvertering_euro();
        //konvertering_sek();   
    }
}