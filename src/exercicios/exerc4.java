package exercicios;

public class exerc4 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][4];
		matriz = Loads(matriz);
		show(matriz, 1, 100);
		show(matriz);
		showOddNumbers(matriz);
		showLargestNumber(matriz);
	}

	static int[][] Loads(int[][] mat) {
		int value;
		for (int j = 0; j <= mat.length; j++) {
			for (int i = 0; i <= mat.length; i++) {
				value = 1 + (int) (Math.random() * 100);
				mat[j][i] = value;
			}
		}
		return mat;
	}

	static void show(int[][] mat, int startAt, int endAt) {
		int value = 0;
		for (int j = 0; j <= mat.length; j++) {
			for (int i = 0; i <= mat.length; i++) {
				if (mat[j][i] > 1 && mat[j][i] <= 100) {
					value += mat[j][i];
				}
			}
		}
		System.out.println(value);
	}

	static void show(int[][] mat) {
		int value = 0;
		for (int j = 0; j <= mat.length; j++) {
			for (int i = 0; i <= mat.length; i++) {
				if ((mat[j][i] / 8) == 0) {
					value += 1;
				}
			}
		}
		System.out.println(value);
	}

	static void showOddNumbers(int[][] mat) {
		int value = 0;
		for (int j = 0; j <= mat.length; j++) {
			for (int i = 0; i <= mat.length; i++) {
				if (((mat[j][i] % 2) != 0) && (mat[j][i] / 3) == 1) {
					value += 1;
				}
			}
		}
		System.out.println(value);
	}

	static void showLargestNumber(int[][] mat) {
		int value = 0;
		for (int j = 0; j <= mat.length; j++) {
			for (int i = 0; i <= mat.length; i++) {
				if (mat[j][i] > value) {
					value = mat[j][i];
				}
			}
		}
		System.out.println(getFacotedValue(value));
	}

	static int getFacotedValue(int value) {
		int fat = 1;
		for (int i = 2; i <= value; i++) {
			fat *= i;
		}
		return fat;
	}

}
