package exercicios;

public class exerc11 {

	public static void main(String[] args) {
		
		rec(1, 10);
	}

	static int rec(int init, int value) {
		System.out.println("1/ " + init);
		if(init == value) {
			return value;
		}
	
		return rec(init + 1, value);
	}
}
