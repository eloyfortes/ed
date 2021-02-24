package exercicios;

public class exerc9 {

	public static void main(String[] args) {
		rec(2);
	}

	static int rec(int val) {
		
		if (val == 300) {
			return 300;
		} else if (val % 2 != 0) {
			System.out.println(val);
			return rec(val + 1);
		}
		return rec(val + 1);
	}
}
