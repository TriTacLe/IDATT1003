import java.util.Scanner;

class øving2oppg1 {
    public static void main(String[] args) {
        Scanner årInput = new Scanner(System.in);        
        
        System.out.println("Skriv inn år: ");

        int år = årInput.nextInt();
        
        if (år%4 == 0){
            System.out.println("år er et skuddår");   
        } else {
            if (år%100 == 0){
                if(år%400 == 0){
                    System.out.println("år er et skuddår");
                } else {
                    System.out.println("år er ikke et skuddår");                
            }
        }
    }
    }
}