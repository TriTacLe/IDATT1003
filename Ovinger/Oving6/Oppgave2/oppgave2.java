import java.util.Scanner;

public class oppgave2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        System.out.println("Skriv inn teksten du vil analysere: ");
        String selveteksten = scanner.nextLine();        
        */

        String selveteksten = "What would I do without your smart mouth?\n" + //
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
                        "And you give me all of you, oh-oh";
        
        tekstanalyse tekst = new tekstanalyse(selveteksten);
     
        tekst.antallUlikeBokstaver();
        tekst.antallAvBokstav();
        tekst.prosenBokstaver();
        tekst.forekomstBokstav('A');
        tekst.maxForekomst();

        scanner.close();
    }
}