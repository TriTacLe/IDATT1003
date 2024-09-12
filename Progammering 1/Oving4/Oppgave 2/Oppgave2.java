import java.util.Scanner;

public class Oppgave2 {
        //attributter: variabler som gir egenskaper til objekter
    public static class Spiller {
        private int sum;
        
        java.util.Random terning= new java.util.Random();

        //constructor
        public Spiller(int sum) {
            this.sum = sum;
        }
        //metoder
        public int getSumPoeng() {
            return sum;

        }

        public void kastTerningen(){
            int terningkast = terning.nextInt(1,7);
            if (terningkast == 1){
                sum = 0;
                System.err.println("Kast på nytt!");
            } else {
                sum += terningkast;      
            }                
            if (sum > 100){
                sum -= terningkast;
            }
            System.out.println("Sum poeng: " + sum);
        
        }
        public boolean erFerdig() {
            return sum == 100;
        }
    }
    //
    public static void main(String[] args) {
        
        int antall_kast = 0;
        
        Scanner scanner = new Scanner(System.in);

        System.err.println("Navn spiller 1: ");
        String spelar1 = scanner.nextLine();

        System.out.println("Navn spiller 2: ");
        String spelar2 = scanner.nextLine();

        Spiller spillerA = new Spiller(0);
        Spiller spillerB = new Spiller(0);

        while (!(spillerA.erFerdig()) && !(spillerB.erFerdig())) {
            antall_kast +=1; 
                
            spillerA.kastTerningen();
            spillerB.kastTerningen();

            if (spillerA.erFerdig()){
                System.out.println(spelar1 + " vant etter " + antall_kast + " kast. " + spelar2 + " tapte.");
                break;
            }
            if (spillerB.erFerdig()) {
                System.out.println(spelar2 + " vant etter " + antall_kast + " kast. " + spelar1 + " tapte.");
                break;
            }
        }
    }
}

