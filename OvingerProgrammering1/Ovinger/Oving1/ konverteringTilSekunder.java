import java.util.Scanner;


class konverteringTilSekunder {
    public static void main(String[] args) {

        Scanner sekundInput = new Scanner(System.in);
        
        System.out.println("Antall timer: ");
        int timer = sekundInput.nextInt();

        System.out.println("Antall minutter: ");
        int minutt = sekundInput.nextInt();

        System.out.println("Antall sekunder: ");
        int sekunder = sekundInput.nextInt();

        int antallSekunder = (timer * 3600 + minutt * 60 + sekunder);

        System.out.println("antall sekunder: " + antallSekunder);
    }
}

