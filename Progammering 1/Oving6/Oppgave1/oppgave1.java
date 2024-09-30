public class oppgave1 {
    public static void main(String[] args) {

        final int range = 10;
        final int repetisjoner = 1000;

        generateRandom tall = new generateRandom(range,repetisjoner); //lager objekt av klassen
        
        tall.RandomNumberGenerator();
        tall.showCount();
    }
}