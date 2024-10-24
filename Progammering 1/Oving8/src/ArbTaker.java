import java.util.GregorianCalendar;
import java.util.Calendar;

public class ArbTaker {
    private final Person personalia;
    private final int arbeidstakernr;
    private int ansettelsesår;
    private double månedslønn;
    private double skatteprosent;

    public ArbTaker(Person personalia, int arbeidstakernr, int ansettelsesår, double månedslønn, double skatteprosent) {
        this.personalia = personalia;
        this.arbeidstakernr = arbeidstakernr;
        this.ansettelsesår = ansettelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent/100;
    }

    GregorianCalendar kalender = new GregorianCalendar();
    int yearNow = kalender.get(Calendar.YEAR);
    /**
     * getters for alle attributter
     *
     * @return
     */

    public Person getPersonalia() {
        return personalia;
    }

    public int getArbeidstakernr() {
        return arbeidstakernr;
    }

    public int getAnsettelsesår() {
        return ansettelsesår;
    }

    public double getMånedslønn() {
        return månedslønn;
    }

    public double getSkatteprosent() {
        return skatteprosent;
    }

    /***
     *setters
     * @return
     */
    public double setMaanedslonn(double nyVerdi) {
        månedslønn = nyVerdi;
        return månedslønn;
    }

    public double setSkatteProsent(double nyVerdi) {
        skatteprosent = nyVerdi;
        //månedslønn = (1-skatteprosent) * månedslønn;
        return skatteprosent;
    }

    //metoder
    public String Navn() {
        return getPersonalia().getEtternavn() +","+getPersonalia().getFornavn();
    }

    public double setSkattetrekkMåned() {
        return this.skatteprosent * this.månedslønn;
    }

    public double setBruttolønn() {
        double bruttolønn = 11*this.månedslønn;
        return bruttolønn;
    }

    public double setNettoLønn() {
        double juni = månedslønn;
        double desember = (1-this.skatteprosent/2) * månedslønn;
        månedslønn = (1-this.skatteprosent) * månedslønn;

        double skattetrekkÅr = månedslønn * 9 + juni + desember;
        return skattetrekkÅr;
    }

    public double skatteTrekkÅr(){
        double juni = månedslønn;
        double desember = skatteprosent/2 * månedslønn;
        double restenAvÅret = skatteprosent * månedslønn*10;

        return juni + desember + restenAvÅret;
    }

    public int antallAarAnsatt(){
        return yearNow - this.ansettelsesår;
    }

    public String ansettelsesAarMerEnn(int aar) {
        int antallAarAnsatt = yearNow - this.ansettelsesår;
        if (antallAarAnsatt - aar > 0){
            return personalia.getFornavn() + " har jobbet mer enn " + aar + " år";
        } else if (antallAarAnsatt - aar < 0) {
            return personalia.getFornavn() + " har jobbet mindre enn " + aar + " år";
        }
        return personalia.getFornavn() + " har år jobbet: " + aar + " år";
    }
}