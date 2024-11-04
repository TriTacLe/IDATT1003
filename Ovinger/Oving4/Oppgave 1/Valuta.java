
public class Valuta { //lager Valute klassen
     //lager attributes her: variabler som gir egenskaper til objektene
    double verdi_nok;
   
    public Valuta(double verdi_nok) { // constructor er en metode som setter opp objektene av en klasse når de blir opprettet
        //setter initial verdi til attributtene
        this.verdi_nok = verdi_nok;        

    //operasjoner (metoder) som bruker attributtene til å få objektene til å handle/kjøre
    }
    public void konvertering_dollar() { //metode "konvertering_dollar" 
        double konvertering_dollar = 0.092 * verdi_nok; 
        System.out.println(verdi_nok + " nok er " + konvertering_dollar + " dollar"); 
    }
    
    public void konvertering_euro() { //
        double konvertering_euro = 0.084 * verdi_nok;
        System.out.println(verdi_nok + " nok er " + konvertering_euro + " euro"); 
    }

    public void konvertering_sek() { //
        double konvertering_sek = 0.96 * verdi_nok;
        System.out.println(verdi_nok + " nok er " + konvertering_sek + " sek" );
    }

    //metoder som konverterer de andre valutaer til nok. Tar inn parameter (verdien av valutaen)
    public void konvertering_dollar_nok(double verdi_dollar) { 
        double konvertering_dollar_nok = 10.83 * verdi_dollar;
        System.out.println(verdi_dollar + " dollar er " + konvertering_dollar_nok + " nok" );
    }
    
    public void konvertering_euro_nok(double verdi_euro) {
        double konvertering_euro_nok = 11.95 * verdi_euro;
        System.out.println(verdi_euro + " euro er " + konvertering_euro_nok + " nok" );
    }

    public void konvertering_sek_nok(double verdi_sek) {
        double konvertering_sek_nok = 1.04 * verdi_sek;
        System.out.println(verdi_sek + " sek er " + konvertering_sek_nok + " nok" );

    }
}
