import java.util.Arrays;

public final class tekstbehandling {
    private final String myTekst;
    private final String myWord;
    private final String [] words; 

    public tekstbehandling (String myTekst, String myWord) {
        this.myTekst = myTekst;
        this.myWord = myWord;
        this.words = myTekst.split(" ");//gjør om setningen til ord som lagres i listen words
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
        int totalLengthOfWords = 0;
        int numWords = 0;
        
        for (String s : words) {
            totalLengthOfWords += s.length(); 
            numWords++;
        }    
        if (numWords == 0){System.out.println("Teksten har ingen tegn");return 0;}

        return totalLengthOfWords/numWords;
    }
    
    public String replaceWord(String myWord, String newWord) {
        int index = Arrays.asList(words).indexOf(myWord); //konverterer array til liste, kan bruke indexOf på liste og ikke array. Metoden virker bare for array av objekter og ikke primitive datatyper
        
        if (index != -1){words[index] = newWord;} else {return "Finner ikke noen ord av " + myWord;}

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
        System.out.println(myTekst);
        String[] periods = myTekst.split("[.!?;]"); //split text til setninger using punctuation as the delimiter
        double totalWords = 0;
        double totalPeriod = 0;
        for (String s : periods) {
            System.out.println(s);
            totalWords += s.length(); //antall ord per periode
            totalPeriod++;
        }
        System.out.println(totalWords);
        System.out.println(totalPeriod);

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