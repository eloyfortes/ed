package exercicios;

public class exerc7 {

	public static void main(String[] args) {
		
		rec(1);
	}

	static int rec(int val) {
		if (val == 100) {
			return 100;
		}
		System.out.println(val);
		return rec(val + 1);
	}
}
