package exercicios;

public class exerc8 {

	public static void main(String[] args) {
		rec(1);
	}

	static int rec(int val) {
		
		if (val == 200) {
			return 200;
		} else if (val % 2 == 0) {
			System.out.println(val);
			return rec(val + 2);
		}
		return rec(val + 1);
	}
}
