//package Oppgave3;

public final class Matrise {
    //final: disse variablene kan bare settes en gang (ved konstruktøren) og kan ikke endres senere
    private final int rows; //rad
    private final int cols; //kolonne
    private final int [][] matrix;

    //konstruktør som tar inn tre parametere som inneholder verdien til matrisen
    public Matrise(int rows, int cols, int[][] values) {
        if (values.length != rows || values[0].length != cols) {
            throw new IllegalArgumentException("dimensjonene er ikke like.");
        }
        //initialisering. rows og cols lagres i instansvariabler
        this.rows = rows;
        this.cols = cols;
        //en ny 2d array opprettes med gitt ytre lengde (rows) og indre lengde (cols)  
        this.matrix = new int[rows][cols];
        //Kopierer verdier fra values arrayen til den interne matrisen
        for (int i = 0; i < rows; i++) {
            System.arraycopy(values[i], 0, this.matrix[i], 0, cols);
        }
    }

    //getMetoder, gir eksterne klasser mulighet til å få tilgang til informasjon om instansen av Matrise uten å kunne endre den. Innkapsling. 
    //returnerer verdi i form av datatype int
    public int getRow() {
        //returnerer instansverdien rows
        return rows;
    }
    public int getCol() {
        //returnerer instansverdien cols
        return cols;
    }
    //returnerer en 2D array av datatype int
    public int [][] getMatrix() {
        //returnerer den interne matrix-arrayen som inneholder verdiene til matrisen
        return matrix;
    }

    //metoden tar et argument, matrise, som er en instans av klassen Matrise. 
    //Metoden returnerer en ny instans av Matrise som representerer resultat av metoden (addisjonen).
    /**
     * Addere to matriser
     * @param matrise matrisen som skal legges til 
     * @return nye matrisen
     */

    public Matrise addisjon(Matrise matrise) {
        //Sjekker om dimensjon til nåværende matrisen, this, er samme som dimensjonene i den andre matrisen, matrise.
        if (this.rows != matrise.rows ||this.cols !=matrise.cols){
            return null;
        }
        //ny 2D array lages for å lagre resultat av addisjonen. 
        int [][] nyMatrise = new int [rows][cols];
        //Itererer gjennom hver rad i og kolonne j
        for (int i = 0; i < rows; i++){
			for (int j = 0; j<cols; j++){
                //this.matrix refererer til den nåværende matrisen på rad i og kolonne j. matrise.matrix referer til den andre matrisen med samme posisjon
				//summen av disse lagres i nyMatrise
                nyMatrise[i][j] = this.matrix[i][j] + matrise.matrix[i][j];
                System.out.print(nyMatrise[i][j] + " ");
			}
            System.out.println();
		}
        //Oppretter ny instans av Matrise med resultat arrayaen nyMatrise som returneres
        return new Matrise(rows, cols, nyMatrise);
    }

    //tar inn et argument, matrise, som er en annen instans av klassen Matrise. Returnerer en ny instans som representerer resultat av metoden
    public Matrise multiplikasjon(Matrise matrise) {
        if (this.cols != matrise.rows) {
            return null;
        }
		
        //lagrer resultat av multiplikasjonen. Har antall rader som den første matrisen (this.rows) og kolonner som den andre (matrise.cols). 
        int [][] nyMatrise = new int [this.rows][matrise.cols];
        //itererer over hver rad i i første matrisen
        for (int i = 0; i < this.rows; i++){
			//itererer over hver kolonne j i andre matrisen
            for (int j = 0; j < matrise.cols; j++){
                //før multiplikasjonen starter for hver element i nyMatrise settes verdien til 0 så vi begynner med en korrekt sum for hver plass i nyMatrise
				nyMatrise[i][j] = 0;
                //itererer gjennom kolonnene i this.matrix og radene i matrise.matrix.
				for (int k = 0; k < this.cols; k++) {
                    //henter verdiene i rad i og k og kolonne k og j i begge matrisene
					nyMatrise[i][j] += this.matrix[i][k]*matrise.matrix[k][j]; 
				}
                System.out.print(nyMatrise[i][j] + " ");
			}
            System.out.println();
		}
        return new Matrise(this.rows, cols, nyMatrise);
    }
    
    //returnerer ny instans av Matrise. Ingen paramterer
    public Matrise Transponering() {
        //kolonner fra denne matrisen og rader fra den andre matrisen. Viser matrisen etter transponering
        int[][] nyMatrise = new int[this.cols][this.rows];
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
                //verdiene til den opprinnelige matrisen på posisjon [i][j] kopieres til den nye matrisen på posisjonen [j][i]. bytter rad og kolnner
				nyMatrise[j][i] = this.matrix[i][j];
                System.out.print(nyMatrise[j][i] + " ");
			}
            System.out.println();
		}
        //oppretter ny instans av klassen Matrise
        return new Matrise(this.rows, this.cols, nyMatrise);
    }

    public Matrise orgMatrise() {
        int [][] denneMatrisen = new int [this.rows][this.cols];
        for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < this.cols; j++) {
				denneMatrisen[i][j] = this.matrix[i][j];
                System.out.print(denneMatrisen[i][j] + " ");
			}
            System.out.println();
		}
        return new Matrise(this.rows, this.cols, denneMatrisen);
    }
}
