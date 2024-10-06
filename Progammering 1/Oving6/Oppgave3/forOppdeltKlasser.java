public class forOppdeltKlasser {
	
	public static void main(String[] args) {
		int [][] OrginalMatrix = {{1,1,1},
								  {2,2,2},
								  {3,3,3}};

		int [][] matrix2 = {{1,1,1},
							{2,2,2},
							{3,3,3}};

		int newMatrix [][] = new int[3][3]; 
		
		System.out.println("Matriseaddisjon");
		for (int i = 0; i < 3; i++){
			for (int j = 0; j<3; j++){
				newMatrix[i][j] = OrginalMatrix[i][j] + matrix2[i][j];
				System.out.print(newMatrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Matrisemultiplikasjon");
		for (int i = 0; i < 3; i++){
			for (int j = 0; j<3; j++){
				newMatrix[i][j] = 0;
				for (int k = 0; k<3; k++) {
					newMatrix[i][j] += OrginalMatrix[i][k]*matrix2[k][j]; 
				}
				System.out.print(newMatrix[i][j] + " ");
			}
			System.out.println();	
		
		}
		System.out.println("Orginale matrisen");
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				System.out.print(OrginalMatrix[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Transponering av matrisen");
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				newMatrix[i][j] = OrginalMatrix[j][i];
				System.out.print(newMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
//Imutabel klasse: 