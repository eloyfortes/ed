package exercicios;

public class exerc3 {
	
	public static void main(String[] args) {
				
	org(loadValues());

	}

	static int[] loadValues() {
		
		int[] values = new int[100];
		for (int i = 0; i < values.length; i++) {
			values[i] =  (int) (Math.random() * 2000) - 750 ;
		
		}
		return values;
	}
	
	static void org (int[] values) {
		
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values.length; j++) {
				int aux = 0;
				
				if (values[j] > values[i]) {
					aux = values[j];
					values[j] = values[i];
					values[i] = aux;
				}
			}
		}
		
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
	}
}
