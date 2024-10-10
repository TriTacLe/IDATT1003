public class oppgave2 {
    public static void main(String[] args) {

        tekstbehandling tekst = new tekstbehandling("Helloo. World.", "Hei");

        System.out.println(tekst.getTekst());
        System.out.println(tekst.getTekstUppercase());

        System.out.println(tekst.numWords());
        System.out.println(tekst.averageWordLength());

        System.out.println(tekst.replaceWord("Helloo.","ABcds"));

        System.out.println(tekst.numWordsPeriod());
    }
}