import java.lang.classfile.instruction.ThrowInstruction;

public class oppgave2 {
    public static void main(String[] args) {
        //objekter
        MinRandom heltall = new MinRandom();
        MinRandom desitall = new MinRandom(); 

        int count = 100;
    
        double ovreDouble = 10;
        double nedreDouble = 0;

        int ovreHel = 10;
        int nedreHel = 0;

        int choice = 1; //1, 2, 3

        int sum = 0;

        if (choice == 1 || choice == 3) {
            for (int i = 0; i <= count; i++) {
                try {
                    double tall = desitall.nesteDesimaltall(nedreDouble, ovreDouble);
                    System.out.println(tall);
                    if (tall <= nedreDouble || tall >= ovreDouble) {
                        throw new IllegalArgumentException("Dette tallet er utenfor intervallet " + nedreDouble + " eller " + ovreDouble + "%f\n" + tall);
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Exception caught: " + e.getMessage());
                }   
            }
            System.out.println("Antall ganger exception caught er " + sum + " av " + count);  
        }
      
        if (choice == 2 || choice == 3) {
            for (int i = 0; i <= count; i++) {
                try {
                    int tall = heltall.nesteHeltall(nedreHel, ovreHel);
                    System.out.println(tall);
                    if (tall <= nedreHel || tall >= ovreHel) {
                        sum += 1;
                        throw new IllegalArgumentException("Dette tallet " + tall + " er utenfor intervallet " + nedreHel + " eller " + ovreHel);
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Exception caught: " + e.getMessage());   
                }
            }    
            System.out.println("Antall ganger exception caught er " + sum + " av " + count); 
        }        
    }
}

