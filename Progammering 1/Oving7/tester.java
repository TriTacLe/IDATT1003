public class tester {
    public static void main(String[] args) {
        //instans av klassen NyString
        NyString nyString = new NyString("Hello World Hello World llll", 'l');

        //kaller på forkorting method og fjerning metoden og printer return verdi
        System.out.println(nyString.forkorting()); // 
        System.out.println(nyString.fjerning()); //    
    }
}
    