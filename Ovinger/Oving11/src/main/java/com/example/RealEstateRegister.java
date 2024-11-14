import java.util.ArrayList;
import java.util.List;

/**
 * Class represent municipality
 * Chose ArrayList as a table because its more flexible and scalable
 */
public class RealEstateRegister {
    ArrayList<RealEstate> realEstates;

    public RealEstateRegister(){
        this.realEstates = new ArrayList<>();
    }

    /**
     * Get realEastates arrayList
     * @return
     */
    public ArrayList<RealEstate> getRealEstates() {
        return realEstates;
    }

    /**
     * Add a realEstate instance to the ArrayList if input is getting validated
     * @param realEstate realstate instance
     */
    public void addRealEstate(RealEstate realEstate){
        if (realEstate == null){
            throw new IllegalArgumentException("Enter a real estate value that is not null");
        }
        if (realEstates.contains(realEstate)) {
            System.out.println("Real estate already in the register. Cannot register duplicates");
            return;
        }
        System.out.println("Real estate added: " + realEstate);
        realEstates.add(realEstate);
    }

    /**
     * remove a realEstate instance to the ArrayList if input is getting validated
     * @param realEstate realEstate instance
     */
    public void removeRealEstate(RealEstate realEstate){
        if (realEstate == null){
            throw new IllegalArgumentException("Enter a real estate value that is not null");
        }
        if (!realEstates.contains(realEstate)) {
            System.out.println(realEstate + " Real estate is not in the register. Cannot delete a non-existing element");
            return;
        }
        System.out.println("Real estate removed: " + realEstate);
        realEstates.remove(realEstate);
    }

    /**
     * Methods that give amount properties registered (amount realEstate instances in the ArrayList)
     * @return realestate size
     */
    public int totalRealEstates(){
        return realEstates.size();
    }

    /**
     * Method that filter out the arguments using streams.
     * Streams method used: filter, findAny and orElseGet
     *
     * @param sectionNumber      a real estate's section number
     * @param municipalityNumber a real estate's municipality number
     * @param lotNumber          a real estate's lot number
     * @return the realestate that confirms the method, or return null and a text if real estate not found
     */
    public boolean findRealEstateByNum(int municipalityNumber, int sectionNumber, int lotNumber){
        RealEstate SearchRealEstate = realEstates.stream()
                .filter(realEstate -> realEstate.getSectionNumber() == sectionNumber)
                .filter(realEstate -> realEstate.getMunicipalityNumber() == municipalityNumber)
                .filter(realEstate -> realEstate.getLotNumber() == lotNumber)
                .findAny()
                //.orElse(null);
                .orElseGet(()->{
                    System.out.println("No RealEstate found with sectionNumber: " + sectionNumber +
                            ", municipalityNumber: " + municipalityNumber +
                            ", lotNumber: " + lotNumber);
                    return null;
                });
        if (SearchRealEstate != null) {
            System.out.println("Found Real estate: " + SearchRealEstate + ". With sectionNumber: " + sectionNumber +
                    ", municipalityNumber: " + municipalityNumber +
                    ", lotNumber: " + lotNumber + "\n" + "formatted: " + SearchRealEstate.formatMunicipalityLotSectionNumber());
        } else {
            return false;
        }
        return true;
    }

    /**
     * Methods that calculates the average area of all the realEstate objects in arrayList
     * Basic math
     */
    public void averageArea(){
        double sum = 0;
        for (RealEstate realEstate : realEstates){
            sum += realEstate.getArea();
        }
        double averageArea = sum/realEstates.size();
        System.out.println("Average area of all real estate in the register: " + averageArea);
    }

    /**
     * Method that finds all instances of realEstate in the instance of RealEstateRegister with the same lot number
     * @param lotNumber lot number
     * @return
     */
    public boolean findRealEstateByLotNumber(int lotNumber){
        List<RealEstate> SearchRealEstate = realEstates.stream()
                .filter(realEstate -> realEstate.getLotNumber() == lotNumber)
                .toList();
                //.collect(Collectors.toList());
        System.out.println("Found real estates at lot number: " + lotNumber + ":");
        SearchRealEstate.forEach(System.out::println);
        if (SearchRealEstate == null){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return realEstates +":";
    }
}
