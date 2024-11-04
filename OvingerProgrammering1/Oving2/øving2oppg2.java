class pris_jakt {
    public static void main(String[] args) {
        double pris_kjøttdeig_a = 35.90; //kr
        double vekt_kjøttdeig_a = 450; //gram

        double pris_kjøttdeig_b = 39.50; // kr
        double vekt_kjøttdeig_b = 500; //gram

        double pris_gram_a = pris_kjøttdeig_a / vekt_kjøttdeig_a;
        double pris_gram_b = pris_kjøttdeig_b / vekt_kjøttdeig_b;

        System.out.println("pris a: " + pris_gram_a);
        System.out.println("pris b: " + pris_gram_b);

        if (pris_gram_a == pris_gram_b){
            System.out.print("De er like dyre");
        } else{
            if (pris_gram_a < pris_gram_b){
                System.out.println("kjøttdeig a er billigere");
                double forskjell_i_pris = pris_gram_a - pris_gram_b;
                System.out.println(forskjell_i_pris);
            } else {
                System.out.println("kjøttdeig b er billigere");
            }
        }        
    }
}