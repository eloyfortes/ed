package exercicios;

public class exerc2 {
		
	
	
	public static void main(String[] args) {
		
		int[] values = loadValues();
		
		showValues(values);
		
		
		
	
		
		

	}
	
	
	static int calculateF(int  n) {
		int aux;
		if (n == 0 || n == 1) {
			return 1;
		}
		
		aux = n;
		for (int i = n-1; i > 0; i-- ) {
			aux = aux * i;
		}
		
		return aux;
 		
	}
	
	static int[] loadValues() {
		
		int[] values = new int[5];
		for (int i = 0; i < values.length; i++) {
			values[i] =  (int) (Math.random() * 10);
			
		}
		return values;
	}
	
	static void showValues(int[] values) {
		int[] fats = new int[values.length];
		
		
		for (int i = 0; i < values.length; i++) {
			fats[i] = calculateF(values[i]);
		}
		
		for (int i = 0; i < values.length; i++) {
			System.out.print("\n Numero: " + values[i] + " Fatorial: " + fats[i]);
		}
		
		
	}
	
}
