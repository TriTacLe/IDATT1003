
/**
 * class that represent a real estate / property.
 */
public class RealEstate {
    private int municipalityNumber;
    private String municipalityName;
    private int lotNumber;
    private int sectionNumber;
    private String name;
    private double area;
    private String ownerName;

    /***
     * Constructor that initialize all attributes
     * With relevant validation of input
     * @param municipalityNumber municipality number
     * @param municipalityName municipality name
     * @param lotNumber lot number
     * @param sectionNumber section number
     * @param name name of the real estate
     * @param area area of the property
     * @param ownerName name of the owner
     */
    public RealEstate(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, String name, Double area, String ownerName){
        if (municipalityNumber < 101 ||  municipalityNumber > 5054){
            throw new IllegalArgumentException("Value must be between 101 and 5054");
        }
        if(municipalityName == null || name == null || ownerName == null){
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (lotNumber < 1 || sectionNumber < 1 || area < 0){
            throw new IllegalArgumentException("Value must be greater than zero");
        }
        this.municipalityNumber = municipalityNumber;
        this.municipalityName = municipalityName;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.name = name;
        this.area = area;
        this.ownerName = ownerName;
    }

    /**
     * Constructor that do not initialize name
     * With relevant validation of input
     * @param municipalityNumber
     * @param municipalityName
     * @param lotNumber
     * @param sectionNumber
     * @param area
     * @param ownerName
     */
    public RealEstate(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, Double area, String ownerName){
        if (municipalityNumber < 101 ||  municipalityNumber > 5054){
            throw new IllegalArgumentException("Value must be between 101 and 5054");
        }
        if(municipalityName == null || ownerName == null){
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (lotNumber < 1 || sectionNumber < 1 || area < 0){
            throw new IllegalArgumentException("Value must be greater than zero");
        }
        this.municipalityNumber = municipalityNumber;
        this.municipalityName = municipalityName;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.area = area;
        this.ownerName = ownerName;
    }

    /**
     * getters
     * @return
     */
    public int getMunicipalityNumber(){
        return municipalityNumber;
    }

    /**
     * getters
     * @return
     */
    public String getMunicipalityName(){
        return municipalityName;
    }

    /**
     * Getters
     * @return
     */
    public int getLotNumber(){
        return lotNumber;
    }

    /**
     * Getters
     * @return
     */
    public int getSectionNumber(){
        return sectionNumber;
    }

    /**
     * getters
     * @return
     */
    public double getArea(){
        return area;
    }

    /**
     * getters
     * @return
     */
    public String getOwnerName(){
        return ownerName;
    }

    /**
     * Owner of the property can be changed. Never used but not useless ot have
     * @param ownerName
     * @return ownerName som representerer argumentet
     */
    public String setOwnerName(String ownerName){
        if (ownerName == null || ownerName.isEmpty()){
            throw new IllegalArgumentException("Name of the owner cannot be null or left empty");
        }
        return ownerName;
    }

    /**
     * Area of the property can be changed. Never used but not useless ot have
     * @param area
     * @return area
     */
    public double setArea(double area){
        if (area < 0) {
            throw new IllegalArgumentException("Area cannot be a negative value");
        }
        return area;
    }
    // the other attributes are very unlikely to be changed because they are fixed information. Of course they can change but it is very unlikely, therefore i will not be making settes methods for them.

    /**
     * Method that formats the numbers: kommunenr-gnr/bnr
     * @return formatted String of numbers
     */
    public String formatMunicipalityLotSectionNumber(){
        String municipalityNumberString = Integer.toString(getMunicipalityNumber());
        String lotNumberString = Integer.toString(getLotNumber());
        String sectionNumberString = Integer.toString(getSectionNumber());
        return municipalityNumberString + "-" + lotNumberString + "/" + sectionNumberString;
    }

    @Override
    public String toString() {
        return "Municipality number: " + municipalityNumber + " Municipality name: " + municipalityName + ". Lot number: " + lotNumber + ". Section number: " + sectionNumber + ". name: " + name + ". Area: " + area + ". Owner name: " + ownerName; //+ "\n" + "Formatted: " +formatMunicipalityLotSectionNumber() + ".";
    }
}
