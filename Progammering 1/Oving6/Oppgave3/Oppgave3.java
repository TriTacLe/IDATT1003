public class Oppgave3 {
	
	public static void main(String[] args) {
		int[][] valuesMatrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] valuesMatrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

		Matrise matrix1 = new Matrise(3, 3, valuesMatrix1);
		Matrise matrix2 = new Matrise(3, 3, valuesMatrix2);

		//Matriseaddisjon
		System.out.println("Matriseaddisjon: ");
		matrix1.addisjon(matrix2);
		
		//Matrisemultiplikasjon
		System.out.println("Matrisemultiplikasjon: ");
		matrix1.multiplikasjon(matrix2);

		//Orginale matrisen
		System.out.println("Orginale matrisen: ");
		matrix1.orgMatrise();

		//Transponering
		System.out.println("Transponering: ");
		matrix1.Transponering();
    }
}