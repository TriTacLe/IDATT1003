public class tekstanalyse {
    private String tekstInput = ""; //teksten
    private final int [] count = new int[30];//lager en liste med lengde lik A til Å, altså 29
    private int sumAntallChar = 0; //antall tegn
    private int antallUlikeChar = 0;//antall ulike char
    private int sumBokstaver = 0; //Antall bokstaver i teksten

    //konstruktør med teksten som arg
    public tekstanalyse (String tekstInput) {
        this.tekstInput = tekstInput.toUpperCase();
    }

    public void antallUlikeBokstaver() {
        for (int i = 0; i<tekstInput.length(); i++) {
            char charUp = tekstInput.charAt(i); //charUp is the character in index i in tekstinput. i = 0 -> charUp = A if tekstinpu "ABC"
            //for letters A-Z, their position based on ASCII value
            if (charUp >= 'A' && charUp <= 'Z'){ //ASCII value
                count[charUp - 'A']++; //count i indeksen til charUp - 'A' øker med en. charUp - 'A' er bokstaven i ASCII verdi 
                sumBokstaver++;

                if (count[charUp - 'A'] == 1) {
                    antallUlikeChar++;
                }
            }
            switch (charUp) {
                case 'Æ':
                    count[26]++;  // Index 26 for Æ
                    sumBokstaver++;
                    if (count[26] == 1) {
                        antallUlikeChar++;
                    }
                    break;
                case 'Ø':
                    count[27]++;  // Index 27 for Ø
                    sumBokstaver++;
                    if (count[27] == 1) {
                        antallUlikeChar++;
                    }
                    break;
                case 'Å':
                    count[28]++;  // Index 28 for Å
                    sumBokstaver++;
                    if (count[28] == 1) {
                        antallUlikeChar++;
                    }
                    break;                
            }
            sumAntallChar++;
        }
        System.out.println("Totalt antall ulike bokstaver i teksten: " + antallUlikeChar);   
        System.out.println("Totalt antall tegn i teksten: " + sumAntallChar);
        System.out.println("Totalt antall bokstaver i teksten: " + sumBokstaver);
    }
   //metode til forekomst av hver bokstav
    public void antallAvBokstav() {
        for (int i = 0; i < 26; i++) {
            System.out.println((char) (i+'A') + ": " + count[i]); //i = 0 lik 'A' fordi (char) (0 + 'A') = (char) (0 + 65) = (char) 65 = 'A'.
        }       
        //hardkode Æ Ø Å
        if (count[26] > 0){ System.out.println("Æ: " + count[26]);} else if (count[26] == 0) {System.out.println("Æ: " + count[26]);}
        if (count[27] > 0){ System.out.println("Ø: " + count[27]);} else if (count[27] == 0) {System.out.println("Ø: " + count[27]);}
        if (count[28] > 0){ System.out.println("Å: " + count[28]);} else if (count[28] == 0) {System.out.println("Å: " + count[28]);}
    }
    
    public void prosenBokstaver() {
        double sumBokstaverXsumAntallChar =(double)sumBokstaver/sumAntallChar * 100;
        System.out.println("Hvor mange % bokstaver er det er i teksten: " +sumBokstaverXsumAntallChar + "%");   
    }
    public void forekomstBokstav (char bokstav) {
        int sumForekomst = 0;
        for (int i = 0; i < tekstInput.length(); i++) {
            if (bokstav == tekstInput.charAt(i)) {
                sumForekomst++;
            }
        }
        System.out.println("Antall forekomster av bokstaven '" + bokstav + "': " + sumForekomst);
    }

    public void maxForekomst () {
        int maxValue = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxValue) {
                maxValue = count[i];
            }
        }
        System.out.print("Mest forekommende bokstav ");
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxValue) {
                if (i < 26) {
                    System.out.print((char)(i + 'A') + " "); // A-Z
                } else if (i == 26) {
                    System.out.print('Æ' +" ");
                } else if (i == 27) {
                    System.out.print('Ø' + " ");
                } else if (i == 28) {
                    System.out.print('Å'+ " ");
                }
            }
        }       
        System.out.println("med " + maxValue + " forekomster.");    
    } 
}
 
