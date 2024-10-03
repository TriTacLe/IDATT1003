//package Oppgave3;

public class Matrise {
    int [][] matrise;

    
    public void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++){ // length returns number of rows
	    	for (int j = 0; j < matrix[i].length; j++) { // here length returns number of columns corresponding to current row 
				System.out.print( matrix[i][j]  + "\t"); // matrix[i][j] will return each element placed at row ‘i',column 'j'
	    	}
	    System.out.println();
	   	}
	}
}
