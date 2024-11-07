import java.util.Scanner;

public class oppgave1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("teller til brok1: ");
        int teller1 = scanner.nextInt();

        System.out.println("nevner til brok1: ");
        int nevner1 = scanner.nextInt();

        System.out.println("teller til brok2: ");
        int teller2 = scanner.nextInt();

        System.out.println("nevner til brok2: ");
        int nevner2 = scanner.nextInt();
        
        //objekter
        Brok brok1 = new Brok(teller1,nevner1);
        Brok brok2 = new Brok(teller2,nevner2);

        System.out.println("brok1: " + brok1.getTeller() + "/" + brok1.getNevner());
        System.out.println("brok2: " + brok2.getTeller() + "/" + brok2.getNevner());
        
        //henter metoder
        String resultatAdd = brok2.addition(brok1.getTeller(),brok1.getNevner());
        System.out.println("Result of addition: " + resultatAdd);
        
        String resultatSub = brok2.substraksjon(brok1.getTeller(),brok1.getNevner());
        System.out.println("Result of substraction: " + resultatSub);
        
        String resultatMultiplikasjon = brok2.multiplikasjon(brok1.getTeller(),brok1.getNevner());
        System.out.println("Result of multiplication: " + resultatMultiplikasjon);
        
        String resultatDiv = brok2.divisjon(brok1.getTeller(),brok1.getNevner());
        System.out.println("Result of div: " + resultatDiv);    
    }
}