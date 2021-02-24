package exercicios;

import java.util.Random;

public class exerc1 {
	
	public static void main(String[] args) {
	
		int[] values = loadValues();
		calculateMedia(values);
		calculateMediaTotal(values);
		calculateNegativeValues(values);
		
		
	

	}
	
	static void calculateMedia(int[] values){
		int cont = 0;
		int total = 0;
		for (int i = 0;  i < values.length ; i++) {
	
			if ( values[i] >= 100 && values[i] <= 1000) {
				cont++ ;
				total += values[i];
			}
		}
		System.out.println("A media dos valores positivos é: " + total/cont);
	}
	
	static void calculateMediaTotal(int[] values){
		int total = 0;
		for (int i = 0;  i < values.length ; i++) {
				total += values[i];
		}
		System.out.println("A media total é " + total/100);
	}
	
	static void calculateNegativeValues(int[] values){
		int total = 0;
		for (int i = 0;  i < values.length ; i++) {
			if ( values[i] < 0) {
				total += values[i];
			}
		}
		System.out.println("Soma dos numeros negativos é " + total);
	}
	
	
	
	static int[] loadValues() {
	
		int[] values = new int[100];
		for (int i = 0; i < values.length; i++) {
			values[i] =  (int) (Math.random() * 2000) - 750 ;
		
		}
		return values;
	}

}
