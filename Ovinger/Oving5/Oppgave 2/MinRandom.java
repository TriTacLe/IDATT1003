import java.util.Random;

public class MinRandom {
    private static final java.util.Random RANDOM= new java.util.Random();

    //metoder
    public int nesteHeltall(int nedre, int ovre) { // intervallet (nedre, ovre)
        int nyHeltall = RANDOM.nextInt(ovre-nedre) + nedre; //hvis ovre = 10 og nedre = 3 vil 7(0,6),+nedre blir (3,9).
        return nyHeltall;
    }

    public double nesteDesimaltall(double nedre, double ovre) { // intervallet >nedre, ovre>
        double nyDesimal = RANDOM.nextDouble(ovre-nedre) + nedre;
        //double nyDesimal = nedre + RANDOM.nextDouble() * (ovre-nedre);     
        return nyDesimal;
    }
}

