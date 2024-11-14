import java.util.Random;
import java.util.Scanner;

public class UI {
    private final Scanner sc = new Scanner(System.in);  // Single scanner instance for the entire class

    private int showMenu() {
        System.out.println("\n***** Property Register Application v0.1 *****\n");
        System.out.println("1. Add property to register");
        System.out.println("2. List all properties");
        System.out.println("3. Search property by municipality, section, and lot number");
        System.out.println("4. Calculate average area");
        System.out.println("5. Remove property");
        System.out.println("6. Total properties");
        System.out.println("7. Find all properties with lot number");
        System.out.println("8. Find the formatted number of a property");
        System.out.println("9. Generate dummy properties");
        System.out.println("10. Quit");
        System.out.println("\nPlease enter a number between 1 and 10.\n");

        if (sc.hasNextInt()) {
            int menuChoice = sc.nextInt();
            sc.nextLine();
            if (menuChoice >= 1 && menuChoice <= 10) {
                return menuChoice;
            } else {
                System.out.println("Invalid choice. Please select a number between 1 and 10.");
            }
        } else {
            sc.nextLine(); // clear invalid input
            System.out.println("You must enter a number, not text.");
        }
        return 0;
    }

    /**
     * A method that makes instances of RealEstate manually by taking in input
     * @return RealEstate instance
     */
    private RealEstate inputRealEstateData() {
        System.out.println("Enter municipality number, municipality name, lot number, section number, name (optional), area, and owner name:");
        int municipalityNumber = sc.nextInt();
        sc.nextLine(); // consume newline
        String municipalityName = sc.nextLine();
        int lotNumber = sc.nextInt();
        int sectionNumber = sc.nextInt();
        sc.nextLine(); // consume newline
        String name = sc.nextLine();
        double area = sc.nextDouble();
        sc.nextLine(); // consume newline
        String ownerName = sc.nextLine();
        return new RealEstate(municipalityNumber, municipalityName, lotNumber, sectionNumber, name, area, ownerName);
    }

    /**
     * Genererer dummies - chat gpt
     * @param realEstateRegister
     * @param numberOfDummies
     */
    public void generateDummyRealEstates(RealEstateRegister realEstateRegister, int numberOfDummies) {
        Random random = new Random();
        String municipalityName = "Gloppen";
        String ownerName = "Tri";

        for (int i = 0; i < numberOfDummies; i++) {
            int municipalityNumber = 1445;
            int lotNumber = 77;
            int sectionNumber = random.nextInt(20) + 1;
            String [] nameRandom = {"Syningom", "Fugletun", "Hoiberg"};
            int randomNumb = random.nextInt(2);
            String name = nameRandom[randomNumb];
            double area = 50 + (500 - 50) * random.nextDouble();
            RealEstate realEstate = new RealEstate(municipalityNumber, municipalityName, lotNumber, sectionNumber, name, area, ownerName);
            realEstateRegister.addRealEstate(realEstate);
        }

        System.out.println(numberOfDummies + " dummy RealEstate objects have been added to the register.");
    }

    /**
     * method that starts the menuapplication (from oppgaven)
     */
    public void start() {
        boolean finished = false;
        RealEstateRegister realEstateRegister = new RealEstateRegister();
        realEstateRegister.addRealEstate(new RealEstate(1445, "Gloppen", 77, 631, 1017.6,"Jens Olsen"));
        realEstateRegister.addRealEstate(new RealEstate(1445, "Gloppen", 77, 131, "Syningom", 661.3,"Nicolay Madsen"));
        realEstateRegister.addRealEstate(new RealEstate(1445, "Gloppen", 75, 19, "Fugletun", 650.6,"Evilyn Jensen"));
        realEstateRegister.addRealEstate(new RealEstate(1445, "Gloppen", 74, 188,1457.2,"Karl Ove Bråten"));
        realEstateRegister.addRealEstate(new RealEstate(1445, "Gloppen", 69, 47, "Høiberg", 1339.4,"Elsa Indregaard"));
        while (!finished) {
            int menuChoice = this.showMenu();
            switch (menuChoice) {
                case 1:
                    RealEstate realEstate = inputRealEstateData();
                    realEstateRegister.addRealEstate(realEstate);
                    break;
                case 2:
                    System.out.println(realEstateRegister);  // Assuming toString() lists properties
                    break;
                case 3:
                    System.out.println("Enter municipality number, section number, and lot number:");
                    int mun = sc.nextInt();
                    int sec = sc.nextInt();
                    int lot = sc.nextInt();
                    System.out.println(realEstateRegister.findRealEstateByNum(mun, sec, lot));
                    break;
                case 4:
                    System.out.print("Average area: ");realEstateRegister.averageArea();
                    break;
                case 5:
                    RealEstate realEstateToRemove = inputRealEstateData();
                    realEstateRegister.removeRealEstate(realEstateToRemove);
                    break;
                case 6:
                    System.out.println("Total properties: " + realEstateRegister.totalRealEstates());
                    break;
                case 7:
                    System.out.println("Enter the lot number to search:");
                    int lotNumberFind = sc.nextInt();
                    System.out.println(realEstateRegister.findRealEstateByLotNumber(lotNumberFind));
                    break;
                case 8:
                    if (realEstateRegister.getRealEstates().isEmpty()) {
                        System.out.println("The property list is empty.");
                    } else {
                        System.out.println("Select a property by index:");
                        for (int i = 0; i < realEstateRegister.getRealEstates().size(); i++) {
                            System.out.println(i + ": " + realEstateRegister.getRealEstates().get(i));
                        }
                        int index = sc.nextInt();
                        if (index >= 0 && index < realEstateRegister.getRealEstates().size()) {
                            RealEstate selectedRealEstate = realEstateRegister.getRealEstates().get(index);
                            System.out.println("Formatted property number: " + selectedRealEstate.formatMunicipalityLotSectionNumber());
                        } else {
                            System.out.println("Invalid index.");
                        }
                    }
                    break;
                case 9:
                    System.out.println("Enter the number of dummy RealEstate objects to generate:");
                    int numberOfDummies = sc.nextInt();
                    generateDummyRealEstates(realEstateRegister, numberOfDummies);
                    break;
                case 10:
                    System.out.println("Thank you for using the Properties app!");
                    finished = true;
                    break;
                default:
                    System.out.println("Please select a valid menu option.");
            }
        }
        sc.close();  
    }
}
