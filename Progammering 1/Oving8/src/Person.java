public class Person {
    private String fornavn;
    private String etternavn;
    private int alder;

    public Person(String fornavn, String etternavn, int alder){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.alder = alder;
    }

    public String getFornavn(){
        return fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public int getAlder(){
        return alder;
    }

}
