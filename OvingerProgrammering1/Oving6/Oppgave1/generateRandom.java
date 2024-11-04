public class generateRandom {
    //attributter
    private int range; //range fra 1 til 10 
    private int repetisjoner; //antall repetisjoner
    private int [] count; //liste med lengde 1-10 som inneholder tall fra 1 til 10
    private String star;

    //Construtor som initialiserer range, repetisjoenr og count array
    public generateRandom(int range, int repetisjoner) { //paramter range og repetisjoner
        this.range = range;
        this.repetisjoner = repetisjoner;
        this.count = new int[range]; //setter count med lengde = range som er en parameter
        this.star = star;
    }
    
    private static final java.util.Random RANDOM = new java.util.Random(); 

    //metode
    public void RandomNumberGenerator() {
        for (int i = 0; i < repetisjoner; i++) { //repeterer så lengde i er mindre enn antall repetisjoner 
            int randomTall = RANDOM.nextInt(range); //deklarer random tall lik et tilfeldig tall mellom 0 og 9. 
            count[randomTall]++; //hvis 1 genereses i RANDOM.nextInt legges det +1 på indeks 0 der count er en liste med lengde      
        }
    }

    public void showCount() {

        for (int i = 0; i < count.length; i++) {
            star ="";
            for (int j = 5; j < count[i]; j+=10) {
                star += "*";
            }
            System.out.println((i) + " : " + count[i] + star); //for hver i i range blir lik count[i]
        }
    }
}