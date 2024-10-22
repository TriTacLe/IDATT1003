public class ArbTaker {
    private Person personalia;
    private int arbeidstakernr;
    private int ansettelsesår;
    private double månedslønn;
    private double skatteprosent;


    public ArbTaker(Person personalia, int arbeidstakernr, int ansettelsesår, double månedslønn, double skatteprosent) {
        this.personalia = personalia;
        this.arbeidstakernr = arbeidstakernr;
        this.ansettelsesår = ansettelsesår;
        this.månedslønn = månedslønn;
        this.skatteprosent = skatteprosent;
    }

    /**
     * getters for alle attributter
     * @return
     */
    public Person getPersonalia(){
        return personalia;
    }
    public int getArbeidstakernr(){
        return arbeidstakernr;
    }
    public int getAnsettelsesår(){
        return ansettelsesår;
    }
    public double getMånedslønn(){
        return månedslønn;
    }
    public double getSkatteprosent(){
        return skatteprosent;
    }
}