//import java.lang.classfile.instruction.ThrowInstruction;

public class Brok {
    //atributter
    private int teller;
    private int nevner;


    //konstruktør
    public Brok(int teller, int nevner) {
        if (nevner == 0){
            throw new IllegalArgumentException("Nevner kan ikke være lik 0");
        }
        this.teller = teller;
        this.nevner = nevner;   
    }
    
    //konstruktør   
    public Brok(int teller) {
        this.teller = teller;
        this.nevner = 1;
    }
    
    //get metoder
    public int getTeller() {
        return teller;
    }

    public int getNevner() {
        return nevner;
    }

    //metoder
    public String addition(int teller, int nevner) {
        int nyTeller = this.teller * nevner + teller * this.nevner;
        int nyNevner = this.nevner * nevner; 

        int fellesDeler = forkortelse(nyTeller, nyNevner);
        
        nyTeller /= fellesDeler;
        nyNevner /= fellesDeler;    
        
        return nyTeller + "/" + nyNevner;
    }

    public String substraksjon(int teller, int nevner) {
        int nyTeller = this.teller * nevner - teller * this.nevner;
        int nyNevner = this.nevner * nevner;
        
        int fellesDeler = forkortelse(nyTeller, nyNevner);
        
        
        nyTeller /= fellesDeler;
        nyNevner /= fellesDeler; 

        return nyTeller + "/" + nyNevner;
    }

    public String multiplikasjon(int teller, int nevner) {
        int nyTeller = this.teller * teller;
        int nyNevner = this.nevner * nevner;

        int fellesDeler = forkortelse(nyTeller, nyNevner);
        
        nyTeller /= fellesDeler;
        nyNevner /= fellesDeler; 

        return nyTeller + "/" + nyNevner;
    }

    public String divisjon(int teller, int nevner) {
        int nyTeller = this.teller * nevner;
        int nyNevner = this.nevner * teller;

        int fellesDeler = forkortelse(nyTeller, nyNevner);
        
        nyTeller /= fellesDeler;
        nyNevner /= fellesDeler; 

        return nyTeller + "/" + nyNevner;
    }

    // forkortelse, Euklids algoritme: tar resten når vi deler teller med nevner og bytter verdiene til nevner og teller.
    public int forkortelse(int teller, int nevner) {
        //looper helt til nevner er 0
        while (nevner != 0) {
            //gamle verdien av teller lagres i denne
            int tellerPrevious = nevner;
            //nevner blir resten av teller/nevner
            nevner = teller % nevner;
            //teller blir forrige nevner
            teller = tellerPrevious;
        }
        //når nevner er 0 vil teller ha felles divisor 
        return teller;
    }
}
