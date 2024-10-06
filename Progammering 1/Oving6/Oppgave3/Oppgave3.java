public class Oppgave3 {
	
	public static void main(String[] args) {
		//opprettes en 2D array som representerer den første matrisen
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
		//oppretter to instanser av Matrise. Konstruktøren til Matrise tar inn tre argumenter; rader, kolonner og verdier i form av 2D array
		//Konstuktøren vil sjekke at dimensjonene av values stemmer med angitte rows og cols. Deretter vil verdiene i valuesMatrix1 kopieres inn i den interne matrisen (2D arrayen) i matrix 1
		Matrise matrix1 = new Matrise(3, 3, valuesMatrix1);
		Matrise matrix2 = new Matrise(3, 3, valuesMatrix2);

		//Matriseaddisjon
		System.out.println("Matriseaddisjon: ");
		//kaller addisjonsmetoden på matrix1 og sender matrix2 som parameter
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