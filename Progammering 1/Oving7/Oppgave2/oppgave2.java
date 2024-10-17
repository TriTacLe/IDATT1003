public class oppgave2 {
    public static void main(String[] args) {

        tekstbehandling tekst = new tekstbehandling("æøåæøå. Hello. World. æøåæøå.");

        System.out.println("Selve teksten: " + tekst.getTekst());
        System.out.println("Teksten i storebokstaver: " + tekst.getTekstUppercase());

        System.out.println("Antall ord: " + tekst.numWords());
        System.out.println("Gjennomsnittslig ordlengde " + tekst.averageWordLength());

        String OrgOrd = "æøåæøå.";
        String nyttOrd = "ø æ å ø æ å";

        System.out.println("Byttet ut: " + "\"" + OrgOrd + "\"" +" med " + "\"" + nyttOrd + "\"" + " Endret tekst: " + tekst.replaceWord(OrgOrd,nyttOrd)); //OrgOrd må inneholde ordet og skilletegnet bak 

        System.out.println("Antall ord per periode(setning): " + tekst.numWordsPeriod());
    }
}