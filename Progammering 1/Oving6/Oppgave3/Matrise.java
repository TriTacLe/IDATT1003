//package Oppgave3;

public final class Matrise {
    private final int rows; //rad
    private final int cols; //kolonne
    private final int [][] matrix;

    //konstruktør
    public Matrise(int rows, int cols, int[][] values) {
        if (values.length != rows || values[0].length != cols) {
            throw new IllegalArgumentException("dimensjonene er ikke like.");
        }
        this.rows = rows;
        this.cols = cols;
        this.matrix = new int[rows][cols]; //initialiserer row og col
        for (int i = 0; i < rows; i++) {
            System.arraycopy(values[i], 0, this.matrix[i], 0, cols);
        }
    }

    //getMetoder
    public int getRow() {
        return rows;
    }
    public int getCol() {
        return cols;
    }
    
    public int [][] getMatrix() {
        return matrix;
    }

    //metoder for regning
    public Matrise addisjon(Matrise matrise) {
        if (this.rows != matrise.rows ||this.cols !=matrise.cols){
            return null;
        }
        
        int [][] nyMatrise = new int [rows][cols];
        for (int i = 0; i < rows; i++){
			for (int j = 0; j<cols; j++){
				nyMatrise[i][j] = this.matrix[i][j] + matrise.matrix[i][j];
                System.out.print(nyMatrise[i][j] + " ");
			}
            System.out.println();
		}
        return new Matrise(rows, cols, nyMatrise);
    }

    public Matrise multiplikasjon(Matrise matrise) {
        if (this.cols != matrise.rows) {
            return null;
        }
		
        int [][] nyMatrise = new int [this.rows][matrise.cols];
        for (int i = 0; i < this.rows; i++){
			for (int j = 0; j<matrise.cols; j++){
				nyMatrise[i][j] = 0;
				for (int k = 0; k<this.cols; k++) {
					nyMatrise[i][j] += this.matrix[i][k]*matrise.matrix[k][j]; 
				}
                System.out.print(nyMatrise[i][j] + " ");
			}
            System.out.println();
		}
        return new Matrise(this.rows, cols, nyMatrise);
    }
    
    public Matrise Transponering() {
        int[][] nyMatrise = new int[this.cols][this.rows];
		for (int i = 0; i<this.cols; i++) {
			for (int j = 0; j<this.rows; j++) {
				nyMatrise[i][j] = this.matrix[j][i];
                System.out.print(nyMatrise[i][j] + " ");
			}
            System.out.println();
		}
        return new Matrise(this.rows, this.cols, nyMatrise);
    }

    public Matrise orgMatrise() {
        int [][] denneMatrisen = new int [this.rows][this.cols];
        for (int i = 0; i<this.rows; i++) {
			for (int j = 0; j<this.cols; j++) {
				denneMatrisen[i][j] = this.matrix[i][j];
                System.out.print(denneMatrisen[i][j] + " ");
			}
            System.out.println();
		}
        return new Matrise(this.rows, this.cols, denneMatrisen);
    }
}
