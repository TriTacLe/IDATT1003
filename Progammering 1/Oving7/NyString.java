public final class NyString {
    private String myString;
    private char myBokstav;

    public NyString(String myString, char myBokstav) {
        this.myString = myString;
        this.myBokstav = myBokstav;
    }

    public String forkorting() {
        String[] words = myString.split(" "); //setning om til ord
        String newStr = "";

        for (String s : words) {
            char forsteChar = s.charAt(0);
            newStr += forsteChar;
        }
        return newStr;
    }

    public String fjerning() {
        /*så lenge bokstaven finnes i teksten fjern det; while tekst.indexOf(bokstav)
        != -1. lagre posisjonen (indeksen) til indexOf(bokstav) i en variabel
        ny tekst er lik substring av teksten fra 0 til posisjon, + 
        substring av teksten fra posisjon + 1, alså skipper posisjonen*/
        
        //String newStr = "";
        String newStr = myString;
        
        while (newStr.indexOf(myBokstav) != -1) {
            int posisjon = newStr.indexOf(myBokstav); //posisjonen til bokstaven
            newStr = newStr.substring(0,posisjon) + newStr.substring(posisjon + 1); //fjern bokstaven ved å lage substring uten den
        }
        return newStr;
    }
}
