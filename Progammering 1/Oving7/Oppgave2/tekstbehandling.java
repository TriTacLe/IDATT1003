
public final class tekstbehandling {
    private final String myTekst;
    private final String [] words; 
    private final String [] wordsUtenSkilletegn;

    public tekstbehandling (String myTekst) {
        this.myTekst = myTekst;
        this.words = myTekst.split(" ");//gjør om setningen til ord som lagres i listen words
        this.wordsUtenSkilletegn = myTekst.split("[.!?;]"); //setningen uten skilletegn

    }

    public String getTekst() {
        return myTekst;
    }

    public String getTekstUppercase () {
        return myTekst.toUpperCase();
    }

    public int numWords() {
        int count = 0;
        for (String s : words) {
            count++;
        }
        return count;
        //words.length
    }

    public double averageWordLength() {
        double totalLengthOfWords = 0;
        double numWords = 0;

        for (String s : wordsUtenSkilletegn) {
            totalLengthOfWords += s.length(); 
            numWords++;
        }    
        if (numWords == 0){System.out.println("Teksten har ingen tegn");return 0;}
        //System.out.println(totalLengthOfWords);
        //System.out.println(numWords);

        return totalLengthOfWords/numWords;
    }
    
    public String replaceWord(String myWord, String newWord) {
        boolean found = false;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(myWord)) {  //hvis ord i indeks i = myWord
                words[i] = newWord;        
                found = true;
            }
        }
        if (!found) {
            return "Finner ikke noen ord av " + myWord;
        }

        return String.join(" ",words); //gjør om arrayen til en string, delimiter " " vil sette mellomrom mellom hver element i arrayen
    } 

    /**dele opp i antall perioder. 
    Hvis en setning har en skilletegn på indeks 7 så er en periode fra 0 til indeks 7 
    Fortsetter å lete fra indeks 7.

    Itererer gjennom hvert bokstav helt til man møter skilletegn. Finner indeksen skilletegnet
    er på. substring fra start til indeksen til skilletegnet. Lagrer substringen i en liste
    Itererer videre fra denne indeksen helt til indeksten til neste skilletegn 

    Lagre antall perioder. Finne antall ord hver periode har og finne total sum av antall ord
    total antall ord / antall perioder 
    */
    public double numWordsPeriod() {
        //System.out.println(myTekst); //sjekk printer ut teksten
        double totalWords = 0;
        double totalPeriod = 0;
        for (String s : wordsUtenSkilletegn) {
            //System.out.println(s); //sjekk printer ut arrayen periods
            totalWords += s.length(); //antall ord per periode
            totalPeriod++;
        }
        System.out.println("Antall ord: " + totalWords);
        System.out.println("Antall perioder: " + totalPeriod);

        return totalWords/totalPeriod;
        /* 
        kode som ikke fungerer
        String [] period = {};
        int count = 0;
        for (int i = 0; i < myTekst.length(); i++) {
            int index1 = 0;
            int index2 = 0;
            if (myTekst.charAt(i) == '.' || myTekst.charAt(i) == '!' || myTekst.charAt(i) == '?' || myTekst.charAt(i) == ';') {
                index2 = i;
                period[count] = myTekst.substring(index1, index2);
                count++;
            }
            index1 = index2;
        }
        int totalPeriod = period.length;
        int totalWords = 0;

        for (int i = 0; i < totalPeriod; i++) {
            totalWords += period[i].length();
        }

        return totalWords/totalPeriod;
        */
    } 
}