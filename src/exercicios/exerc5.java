package exercicios;

public class exerc5 {

		public static void main(String[] args) {
			int[][] matriz = new int[4][4];
			matriz = loadValues(matriz);

		}
		
		static int[][] loadValues(int[][] mat) {
			int value = 1;
			for (int j = 0; j <= mat.length; j++) {
				for (int i = 0; i <= mat.length; i++) {
					if(i == j) {
						value *= 3;
						mat[j][i] = value;
					}
				}
			}
			return mat;
		}

	

}
