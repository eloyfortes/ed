package exercicios;

import java.util.Scanner;

public class exerc6 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite 1 numero");
			int val = scanner.nextInt();
			recursive(val);
		}
	}

	static int recursive(int value) {
		if (value == 1) {
			return 1;
		}
		System.out.println(value);
		return recursive(value - 1)) ;
	}
}
