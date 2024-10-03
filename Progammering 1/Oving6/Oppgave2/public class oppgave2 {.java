
public class oppgave2 {
    public static void main(String[] args) {
        /* 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tekst: ");
        
        String OrgTekstInput = scanner.nextLine();
        */
        String OrgTekstInput = "What would I do without your smart mouth?\n" + //
                        "Drawing me in, and you kicking me out\n" + //
                        "You've got my head spinning, no kidding\n" + //
                        "I can't pin you down\n" + //
                        "What's going on in that beautiful mind?\n" + //
                        "I'm on your magical mystery ride\n" + //
                        "And I'm so dizzy, don't know what hit me\n" + //
                        "But I'll be alright\n" + //
                        "My head's underwater\n" + //
                        "But I'm breathing fine\n" + //
                        "You're crazy and I'm out of my mind\n" + //
                        "'Cause all of me loves all of you\n" + //
                        "Love your curves and all your edges\n" + //
                        "All your perfect imperfections\n" + //
                        "Give your all to me, I'll give my all to you\n" + //
                        "You're my end and my beginning\n" + //
                        "Even when I lose, I'm winning\n" + //
                        "'Cause I give you all of me\n" + //
                        "And you give me all of you, oh-oh\n" + //
                        "How many times do I have to tell you\n" + //
                        "Even when you're crying, you're beautiful too?\n" + //
                        "The world is beating you down\n" + //
                        "I'm around through every mood\n" + //
                        "You're my downfall, you're my muse\n" + //
                        "My worst distraction, my rhythm and blues\n" + //
                        "I can't stop singing\n" + //
                        "It's ringing in my head for you\n" + //
                        "My head's underwater\n" + //
                        "But I'm breathing fine\n" + //
                        "You're crazy, and I'm out of my mind\n" + //
                        "'Cause all of me loves all of you\n" + //
                        "Love your curves and all your edges\n" + //
                        "All your perfect imperfections\n" + //
                        "Give your all to me, I'll give my all to you\n" + //
                        "You're my end and my beginning\n" + //
                        "Even when I lose, I'm winning\n" + //
                        "'Cause I give you all of me\n" + //
                        "And you give me all of you, oh-oh\n" + //
                        "Give me all of you\n" + //
                        "Cards on the table, we're both showing hearts\n" + //
                        "Risking it all, though it's hard\n" + //
                        "'Cause all of me loves all of you\n" + //
                        "Love your curves and all your edges\n" + //
                        "All your perfect imperfections\n" + //
                        "Give your all to me, I'll give my all to you\n" + //
                        "You're my end and my beginning\n" + //
                        "Even when I lose, I'm winning\n" + //
                        "'Cause I give you all of me\n" + //
                        "And you give me all of you\n" + //
                        "I give you all of me\n" + //
                        "And you give me all of you, oh-oh\n" + //
                        "OOOÆØÅÆÅØÅÅØ1278631";

        String tekstInput = OrgTekstInput.toUpperCase(); //Gjør om teksten til uppercase 

        int [] count = new int[29];//lager en liste med lengde lik A til Å, altså 29

        int sumAntallChar = 0; //antall tegn

        int antallUlikeChar = 0;//antall ulike char

        int sumBokstaver = 0; //Antall bokstaver i teksten

        //Antall ulike bokstaver, antall tegn, sum bokstaver
        for (int i = 0; i<tekstInput.length(); i++) {
            char charUp = tekstInput.charAt(i); //charUp is the character in index i in tekstinput. i = 0 
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
                    if (count[26] == 1) {
                        antallUlikeChar++;
                        sumBokstaver++;
                    }
                    break;
                case 'Ø':
                    count[27]++;  // Index 27 for Ø
                    if (count[27] == 1) {
                        antallUlikeChar++;
                        sumBokstaver++;
                    }
                    break;
                case 'Å':
                    count[28]++;  // Index 28 for Å
                    if (count[28] == 1) {
                        antallUlikeChar++;
                        sumBokstaver++;
                    }
                    break;
                default:
                    if (charUp <= 'A' && charUp >= 'Z') {count[29]++;}
            }
            sumAntallChar++;
        }

        //Forekomst til hver bokstav 
        for (int i = 0; i < 26; i++) {    
            System.out.println((char) (i+'A') + ": " + count[i]); //i = 0 lik 'A' fordi (char) (0 + 'A') = (char) (0 + 65) = (char) 65 = 'A'.
            //ikke bruk tekstInput.charAt(i+'A'-1) 
        }
        //hardkode Æ Ø Å
        if (count[26] > 0){ System.out.println("Æ: " + count[26]);} else if (count[26] == 0) {System.out.println("Æ: " + count[26]);}
        if (count[27] > 0){ System.out.println("Ø: " + count[27]);} else if (count[27] == 0) {System.out.println("Ø: " + count[27]);}
        if (count[28] > 0){ System.out.println("Å: " + count[28]);} else if (count[28] == 0) {System.out.println("Å: " + count[28]);}
        
        System.out.println("Totalt antall ulike bokstaver i teksten: " + antallUlikeChar);   
        System.out.println("Totalt antall tegn i teksten: " + sumAntallChar);
        System.out.println("Totalt antall bokstaver i teksten: " + sumBokstaver);

        double sumBokstaverXsumAntallChar =(double)sumBokstaver/sumAntallChar * 100;
        System.out.println("Hvor mange % bokstaver er det er i teksten: " +sumBokstaverXsumAntallChar + "%");

        //antall ganger "bokstav" dukker opp i teksten
        char bokstav = 'A';
        int sumForekomst = 0;

        for (int i = 0; i < tekstInput.length(); i++) {
            if (bokstav == tekstInput.charAt(i)) {
                sumForekomst++;
            }
        }
        System.out.println("Antall ganger " + bokstav + " dukket opp i teksten: " + sumForekomst);
        
        //finner maks verdien til indeksen i listen count
        int maxValue = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxValue) {
                maxValue = count[i];
            }
        }

        //finner bokstaven til mest indeksen til maksverdien i []count
        System.out.print("Mest forekommende bokstav ");
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxValue) {
                if (i < 26) {
                    System.out.print((char)(i + 'A') + " "); // A-Z
                } else if (i == 26) {
                    System.out.print('Æ');
                } else if (i == 27) {
                    System.out.print('Ø');
                } else if (i == 28) {
                    System.out.print('Å');
                }
            }
        }       
        System.out.println("med " + maxValue + " forekomster.");    
    }    
}