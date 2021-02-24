package exercicios;

public class exerc10 {

	public static void main(String[] args) {
		
		rec(10, 10);
	}

	static int rec(int init, int value) {
		System.out.println(value);
		if (init == 0 || value == 1) {
			return value;
		}
		return rec(init- 1, init + value -1);
	}
}
