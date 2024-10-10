public class tester {
    public static void main(String[] args) {
        //instans av klassen NyString
        String tekst = "Hello World Hello World llll";
        NyString nyString = new NyString(tekst, 'l');

        System.out.println("Før endring: " + tekst);
        //kaller på forkorting method og fjerning metoden og printer return verdi
        System.out.println("Etter forkorting: " + nyString.forkorting()); // 
        System.out.println("Etter fjerning: " + nyString.fjerning()); //    
    }
}
    