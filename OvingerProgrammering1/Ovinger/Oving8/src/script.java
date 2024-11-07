import java.util.Scanner;

public class script {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fornavn:");
        String fornavn = scanner.nextLine();

        System.out.println("Etternavm:");
        String etternavn = scanner.nextLine();

        System.out.println("Alder:");
        int alder = scanner.nextInt();

        // Create a Person object
        Person person = new Person(fornavn, etternavn, alder);

        // Input for ArbTaker
        System.out.println("Ansettelsesnummer:");
        int Id = scanner.nextInt();

        System.out.println("Hvilket årstall ble du ansatt: ");
        int aarAnsatt = scanner.nextInt();

        System.out.println("Bruttolønn månedslønn: ");
        double lonn = scanner.nextDouble();

        System.out.println("Skatteprosent: ");
        int skatteprosent = scanner.nextInt();

        ArbTaker arbtaker = new ArbTaker(person, Id, aarAnsatt, lonn, skatteprosent);

        boolean runner = true;

        while (runner) {
            System.out.println("\nMeny");
            System.out.println("1. Vis informasjon");
            System.out.println("2. Endre månedslønn");
            System.out.println("3. Endre skatteprosent");
            System.out.println("4. Vis skattetrekk per måned");
            System.out.println("5. Vis bruttolønn per år");
            System.out.println("6. Vis nettolønn per år");
            System.out.println("7. Vis antall år ansatt ");
            System.out.println("8. Sjekk om ansatt i mer enn X år");
            System.out.println("9. Vis skattetrekk per år");
            System.out.println("10. Vis navn: ");
            System.out.println("11. Vis alder: ");
            System.out.println("12. Avslutt");
            System.out.print("Velg et alternativ: ");

            int valg = scanner.nextInt();

            switch (valg) {
                case 1:
                    System.out.println(arbtaker.toString());
                    break;
                case 2:
                    System.out.print("Skriv inn ny månedslønn: ");
                    double nyMaanedsLonn = scanner.nextDouble();
                    arbtaker.setMaanedslonn(nyMaanedsLonn);
                    System.out.println("Månedslønn oppdatert.");
                    break;
                case 3:
                    System.out.print("Skriv inn ny skatteprosent: ");
                    double nySkatteProsent = scanner.nextDouble();
                    arbtaker.setSkatteProsent(nySkatteProsent);
                    System.out.println("Skatteprosent oppdatert.");
                    break;
                case 4:
                    System.out.println("Skattetrekk per måned: " + arbtaker.setSkattetrekkMåned());
                    break;
                case 5:
                    System.out.println("Bruttolønn per år: " + arbtaker.setBruttolønn());
                    break;
                case 6:
                    System.out.println("Nettolønn per år: " + arbtaker.setNettoLønn());
                    break;
                case 7:
                    System.out.println("Antall år ansatt har jobbet: " + arbtaker.antallAarAnsatt());
                    break;
                case 8:
                    System.out.print("Skriv inn antall år for sammenligning: ");
                    int aar = scanner.nextInt();
                    System.out.println(arbtaker.ansettelsesAarMerEnn(aar));
                    break;
                case 9:
                    System.out.println("Vis skattetrekk per år: " + arbtaker.skatteTrekkÅr());
                    break;
                case 10:
                    System.out.println("Alder: " + arbtaker.getAlder());
                    break;
                case 11:
                    System.out.println("Navn: " + arbtaker.getNavn());
                    break;
                case 12:
                    runner = false;
                    break;
                default:
                    System.out.println("Ugyldig valg. Prøv igjen.");
                    break;
            }
        }

        scanner.close();
    }
}
